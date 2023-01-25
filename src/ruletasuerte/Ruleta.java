package ruletasuerte;

import java.util.Scanner;

/**
 *
 * @author a22luismsg
 */

 /*
 * En esta clase tenemos las diferentes opciones de la ruleta.
 */
public class Ruleta {

    /*
     * OPCIONES DE LA RULETA:
     * 1: quiebra
     * 2: pierde turno
     * 3: comodín
     * 102: x2
     * 12: 1/2
     */

    private static int[] ruleta = { 200, 1, 102, 100, 50, 100, 150, 2, 150, 100, 50, 100, 200, 50, 150, 12, 50, 150, 100, 3,
             150, 100, 50, 100 };
    private static int premio;
    private static String letra;
    private static int panel = Tarjetas.elegirPanel();


    public static int getPanel () {
        return panel;
    }

    /**
     * Utilizamos un Math.random y un switch case
     * para elegir una de las opciones de la ruleta aleatoriamente.
     */
    public static int tirar() {

        Scanner sc = new Scanner(System.in);
        premio = 0;
        int opt = (int) (Math.random() * 24);

        switch (ruleta[opt]) {
            case 1:
                return -1;
            case 2:
                return -2;
            case 3:
                System.out.println("Introduce una letra");
                letra = sc.nextLine();
                Tarjetas.buscarLetra(letra.charAt(0), panel);
                return -3;
            case 102:
                premio *= 2;
                break;
            case 12:
                premio /= 2;
                break;
            default:
                System.out.println("Introduce una letra");
                letra = sc.nextLine();
                Tarjetas.buscarLetra(letra.charAt(0), panel);
                premio += ruleta[opt];
        }
        return premio;
    }

}
