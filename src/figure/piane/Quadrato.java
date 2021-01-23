package figure.piane;

public class Quadrato extends FiguraPiana {

    public Quadrato(double lato) {
        super(lato);
    }

    @Override
    public double calcolaperimetro() {
        return this.getBase() * 4;
    }

    @Override
    public double calcolaarea() {
        return (float)Math.pow(this.getBase(), 2);
    }
}
