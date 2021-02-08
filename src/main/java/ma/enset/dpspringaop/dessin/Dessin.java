package ma.enset.dpspringaop.dessin;

import ma.enset.dpspringaop.aspect.MyLog;
import ma.enset.dpspringaop.aspect.SecuredByAspect;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class Dessin implements IDessin {
    private List<Figure> figures=new ArrayList<>();
    private StrategyTraite strategyTraite=new DefaultTraite();
    @Override
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    public void addFigure(Figure f) {
        figures.add(f);
    }

    @Override
    @MyLog
    public void removeFigure(Figure f) {
        figures.remove(f);
    }

    @Override
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    public void displayAll() {
        for (Figure f:figures){
            f.dessiner();
        }
    }

    @Override
    @MyLog
    public void serialiser()  {
        File file=new File("dessin.txt");

        FileOutputStream fileOutputStream= null;
        ObjectOutputStream objectOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            for(Figure f : figures){
                objectOutputStream.writeObject(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    @MyLog
    public void traiter() {
        strategyTraite.traiter();
    }

    public void setStrategyTraite(StrategyTraite strategyTraite) {
        this.strategyTraite = strategyTraite;
    }
}
