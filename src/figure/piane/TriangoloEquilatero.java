package figure.piane;

public class TriangoloEquilatero extends FiguraPiana {

    public TriangoloEquilatero(double base) {
        super(base);
    }

    @Override
    public double calcolaperimetro() {
        return this.getBase() * 3;
    }

    @Override
    public double calcolaarea() {
        return Math.sqrt(3) / 4 * this.getBase();
    }
}
