package ma.enset.dpspringaop.dessin;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Rectangle extends Figure implements Serializable {
    private Point coin;
    private double L;
    private double H;
    @Override
    public double calculSurface() {
        return H*L;
    }

    @Override
    public double calculPerimetre() {
        return 2*(L+H);
    }

    @Override
    public void dessiner() {
        System.out.println("coin :"+coin+" L:"+L+" H:"+H);
    }
}
