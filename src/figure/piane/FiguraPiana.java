package figure.piane;

public abstract class FiguraPiana implements IFiguraPiana {
    private double base;

    public FiguraPiana(double base) {
        this.base = base;
        
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        if(base >= 0) {
            this.base = base;
        }
        else {
            this.base = 0;
        }
    }

    @Override
    public String toString() {
        return "{" +
            " lunghezza='" + getBase() + "'" +
            "}";
    }
}
