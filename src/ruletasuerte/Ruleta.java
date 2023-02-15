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

    private static int[] ruleta = { 200, 1, 102, 100, 50, 100, 150, 2, 150, 100, 50, 100, 200, 50, 150, 12, 50, 150,
            100, 3,
            150, 100, 50, 100 };
    private static int premio, letras = 0;
    private static String letra;

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
                return -3;
            case 102:
                return -4;
            case 12:
                return -5;
            default:
                Tarjetas.mostrarPanel(Juego.getPanel());
                System.out.println("Introduce una letra");
                letra = sc.nextLine();
                letras = Tarjetas.buscarLetra(letra.charAt(0), Juego.getPanel());
                if ( letras == 0 ) return -2;
                premio += ruleta[opt] * letras;
        }
        return premio;
    }

}
