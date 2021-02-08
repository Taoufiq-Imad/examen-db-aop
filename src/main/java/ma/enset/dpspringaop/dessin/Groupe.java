package ma.enset.dpspringaop.dessin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure implements Serializable {
    private List<Figure> figures=new ArrayList<>();
    public void add(Figure f){
        figures.add(f);
    }
    public void remove(Figure f){
        figures.remove(f);
    }
    public List<Figure> getFigures(){
        return figures;
    }
    @Override
    public double calculSurface() {
        double surface=0;
        for (Figure f:figures){
            surface+=f.calculSurface();
        }
        return surface;
    }

    @Override
    public double calculPerimetre() {
        double perimetre=0;
        for (Figure f:figures){
            perimetre+=f.calculPerimetre();
        }
        return perimetre;
    }

    @Override
    public void dessiner() {
        for (Figure f:figures){
            f.dessiner();
        }
    }
}
