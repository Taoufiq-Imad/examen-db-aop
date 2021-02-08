package ma.enset.dpspringaop;

import ma.enset.dpspringaop.aspect.AppContext;
import ma.enset.dpspringaop.dessin.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class Program {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean authenticate=false;
        int tentative=3;
        do {
            System.out.println("Enter username");

            String userName = s.nextLine();  // Read user input
            System.out.println("Enter password");

            String password = s.nextLine();  // Read user input
            authenticate=AppContext.authenticateUser(userName,password,new String[]{"ADMIN"});
        }while (tentative>0 && authenticate==false);
        if (!authenticate){
            throw new RuntimeException("Invalid Credentials..");
        }
        SpringApplication.run(Program.class,args);

    }
    @Bean
    CommandLineRunner commandLineRunner(Dessin dessin){
        return args ->{
                Figure c = new Cercle(new Point(1, 1), 3);
        dessin.addFigure(c);
        Observable o = new Parametre(1, 1, 1);
        o.addObserver(c);
        dessin.displayAll();
        ((Parametre) o).setCouleurContour(4);
        };

    }
}
