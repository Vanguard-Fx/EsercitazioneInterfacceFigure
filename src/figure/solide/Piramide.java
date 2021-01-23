package figure.solide;

public class Piramide extends FiguraSolida {
    //Ipotizzo la piramide solo con una base rettangolare
    private double lunghezza;
    private double larghezza;
    
    public Piramide(double lunghezza, double larghezza, double altezza) {
        super(altezza);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }


    public double getLunghezza() {
        return this.lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        if(lunghezza < 0) {
            this.lunghezza = lunghezza;
        }
        else {
            this.lunghezza = 0;
        }
    }

    public double getLarghezza() {
        return this.larghezza;
    }

    public void setLarghezza(double larghezza) {
        if(larghezza < 0) {
            this.larghezza = larghezza;
        }
        else {
            this.larghezza = 0;
        }
    }

    @Override
    public double calcolavolume() {
        //(Lunghezza * larghezza * altezza) / 3 
        return this.getLunghezza() * this.getLarghezza() * this.getAltezza() / 3;
    }
}
