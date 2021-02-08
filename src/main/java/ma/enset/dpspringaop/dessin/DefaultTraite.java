package ma.enset.dpspringaop.dessin;

public class DefaultTraite implements StrategyTraite {
    @Override
    public void traiter() {
        System.out.println("default triate");
    }
}
