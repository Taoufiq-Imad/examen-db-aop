package ma.enset.dpspringaop.dessin;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Cercle extends Figure implements Serializable {
    private Point centre;
    private double rayon;
    @Override
    public double calculSurface() {
        return Math.PI*Math.pow(rayon,2);
    }

    @Override
    public double calculPerimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("centre : "+centre+"  rayon:"+rayon);
    }
}
