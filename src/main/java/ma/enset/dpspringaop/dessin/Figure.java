package ma.enset.dpspringaop.dessin;

import java.io.Serializable;

public abstract class Figure implements Observer, Serializable {
    @Override
    public void update(Observable o) {
        System.out.println("mettre ajour des parametres");
    }
    public abstract double calculSurface();
    public abstract double calculPerimetre();
    public abstract void dessiner();

}
