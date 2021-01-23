package figure.piane;

public class PentagonoRegolare extends FiguraPiana {
    public final static double RAPPORTO = 0.688;

    public PentagonoRegolare(float base) {
        super(base);
    }

    @Override
    public double calcolaperimetro() {
        return this.getBase() * 5;
    }

    @Override
    public double calcolaarea() {
        // Apotema = base * 0,688
        // Area = Perimetro * Apotema / 2
        double apotema = this.getBase() * RAPPORTO;
        return this.calcolaperimetro() * apotema / 2;
    }
}
