import figure.piane.*;
import figure.solide.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Figure piane
        Quadrato mioQuadrato = new Quadrato(2);
        Rettangolo mioRettangolo = new Rettangolo(2, 3);
        TriangoloEquilatero mioTriangolo = new TriangoloEquilatero(2);
        PentagonoRegolare mioPentagono = new PentagonoRegolare(7);

        System.out.println("Figure piane: ");
        System.out.println("Quadrato con base " + mioQuadrato.getBase() + " Perimetro: " + mioQuadrato.calcolaperimetro() + " Area: " + mioQuadrato.calcolaarea());

        System.out.println("Rettangolo con base " + mioRettangolo.getBase() + " altezza " + mioRettangolo.getAltezza() + 
                           " Perimetro: " + mioRettangolo.calcolaperimetro() + " Area: " + mioRettangolo.calcolaarea());

        System.out.println("Triangolo con base " + mioTriangolo.getBase() + " Perimetro: " + mioTriangolo.calcolaperimetro() + " Area: " + mioTriangolo.calcolaarea());

        System.out.println("Pentagono con base " + mioPentagono.getBase() + " Perimetro: " + mioPentagono.calcolaperimetro() + " Area: " + mioPentagono.calcolaarea());

        //Figure solide
        Cono mioCono = new Cono(5, 10);
        Piramide miaPiramide = new Piramide(5, 10, 15);
        Cubo mioCubo = new Cubo(5);

        System.out.println("Figure solide: ");
        System.out.println("Cono con altezza " + mioCono.getRaggio() + " Volume: " + mioCono.calcolavolume());
        System.out.println("Piramide con altezza " + miaPiramide.getAltezza() + " Volume: " + miaPiramide.calcolavolume());
        System.out.println("Cubo con lato " + mioCubo.getAltezza() + " Volume: " + mioCubo.calcolavolume());

    }
}
