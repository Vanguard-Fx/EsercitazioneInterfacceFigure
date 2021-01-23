package figure.solide;

public abstract class FiguraSolida implements IFiguraSolida {
    //Si poteva usare la classe FiguraPiana e poi fare il casing nelle classi figlie
    private double altezza;


    public FiguraSolida(double altezza) {
        this.altezza = altezza;
    }

    public double getAltezza() {
        return this.altezza;
    }

    public void setAltezza(double altezza) {
        if(altezza >= 0) {
            this.altezza = altezza;
        }
        else {
            this.altezza = 0;
        }
    }
}
