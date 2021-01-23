package figure.solide;

public class Cubo extends FiguraSolida {

    public Cubo(double lato) {
        super(lato);
    }

    @Override
    public double calcolavolume() {
        return Math.pow(this.getAltezza(), 3);
    }
}
