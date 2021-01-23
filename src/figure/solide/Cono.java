package figure.solide;

public class Cono extends FiguraSolida {
    private double raggio;

    public Cono(double raggio, double altezza) {
        super(altezza);
    }
    
    public double calcolavolume() {
        //Il volume di un cono si ottiene moltiplicando l’area di base per la misura dell’altezza e dividendo tale prodotto per tre
        double areaBase = Math.PI * Math.pow(this.getRaggio(), 2);
        return areaBase * this.getAltezza() / 3;
    }

    public double getRaggio() {
        return this.raggio;
    }

    public void setRaggio(double raggio) {
        if(raggio >= 0) {
            this.raggio = raggio;
        }
        else {
            this.raggio = 0;
        }
    }
}
