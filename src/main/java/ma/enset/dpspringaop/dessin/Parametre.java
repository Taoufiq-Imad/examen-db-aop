package ma.enset.dpspringaop.dessin;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Parametre implements Observable {
    private int epaisseurContour;
    private int couleurContour;
    private int couleurRemplissage;

    public Parametre(int epaisseurContour, int couleurContour, int couleurRemplissage) {
        this.epaisseurContour = epaisseurContour;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
    }

    private List<Observer> observers=new ArrayList<>();
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers){
            o.update(this);
        }
    }

    public void setEpaisseurContour(int epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
        notifyObservers();
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
        notifyObservers();
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        notifyObservers();
    }
}
