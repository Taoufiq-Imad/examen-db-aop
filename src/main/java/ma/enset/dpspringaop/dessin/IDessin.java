package ma.enset.dpspringaop.dessin;

import ma.enset.dpspringaop.aspect.MyLog;

public interface IDessin {
    void addFigure(Figure f);
    void removeFigure(Figure f);
    void displayAll();
    void serialiser();
    void traiter();
}
