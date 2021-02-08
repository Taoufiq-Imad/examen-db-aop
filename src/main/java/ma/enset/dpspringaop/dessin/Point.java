package ma.enset.dpspringaop.dessin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Point {
    private double x;
    private double y;
    @Override
    public String toString(){
        return "( "+x+" , "+y+")";
    }
}
