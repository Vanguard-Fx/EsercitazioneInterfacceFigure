package figure.piane;

public class Rettangolo extends FiguraPiana {
    private double altezza;

    public Rettangolo(double lunghezza, double altezza) {
        super(lunghezza);
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

    @Override
    public double calcolaperimetro() {
        return (this.getBase() + getAltezza()) * 2; 
    }

    @Override
    public double calcolaarea() {
        return this.getBase() * this.getAltezza();
    }
}
