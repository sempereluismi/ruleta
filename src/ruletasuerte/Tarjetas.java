package ruletasuerte;

import java.util.ArrayList;

/**
 *
 * Esta clase es donde se almacenan los paneles
 */

/*
 * Aquí tenemos tanto las pistas como las respuestas que debe adivinar el
 * jugador.
 */
public class Tarjetas {

    private static ArrayList<Integer> panelesUsados = new ArrayList<Integer>();

    private static boolean resuelto = false;

    /**
     * Las pistas para saber con que esta relacionado un panel.
     */
    private static String[] pistas = { 
        "Un cordial saludo",
        "No se llevan nada bien",
        "Un peculiar postre",
        "Se pasa todo el dia en el sofa"
    };


    /*
     * Array que contiene las soluciones de los paneles en string
     */
    private static String[] sol = {
        "HOLA BUENAS PROGRAMAR MOLA",
        "ACTUAN COMO PERROS Y GATOS",
        "HELADO DE MENTA Y CHOCOLATE",
        "BUSCA TRABAJO PEDAZO DE VAGO"
    };
    /**
     * Los paneles enteros divididos por letras.
     */
    private static char[][][] paneles = {
            {
                    { 'H', 't' },
                    { 'O', 't' },
                    { 'L', 't' },
                    { 'A', 't' },
                    { ' ', 't' },
                    { 'B', 't' },
                    { 'U', 't' },
                    { 'E', 't' },
                    { 'N', 't' },
                    { 'A', 't' },
                    { 'S', 't' },
                    { ' ', 't' },
                    { 'P', 't' },
                    { 'R', 't' },
                    { 'O', 't' },
                    { 'G', 't' },
                    { 'R', 't' },
                    { 'A', 't' },
                    { 'M', 't' },
                    { 'A', 't' },
                    { 'R', 't' },
                    { ' ', 't' },
                    { 'M', 't' },
                    { 'O', 't' },
                    { 'L', 't' },
                    { 'A', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
            },

            {
                    { 'A', 't' },
                    { 'C', 't' },
                    { 'T', 't' },
                    { 'U', 't' },
                    { 'A', 't' },
                    { 'N', 't' },
                    { ' ', 't' },
                    { 'C', 't' },
                    { 'O', 't' },
                    { 'M', 't' },
                    { 'O', 't' },
                    { ' ', 't' },
                    { 'P', 't' },
                    { 'E', 't' },
                    { 'R', 't' },
                    { 'R', 't' },
                    { 'O', 't' },
                    { 'S', 't' },
                    { ' ', 't' },
                    { 'Y', 't' },
                    { ' ', 't' },
                    { 'G', 't' },
                    { 'A', 't' },
                    { 'T', 't' },
                    { 'O', 't' },
                    { 'S', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
            },

            {
                    { 'H', 't' },
                    { 'E', 't' },
                    { 'L', 't' },
                    { 'A', 't' },
                    { 'D', 't' },
                    { 'O', 't' },
                    { ' ', 't' },
                    { 'D', 't' },
                    { 'E', 't' },
                    { ' ', 't' },
                    { 'M', 't' },
                    { 'E', 't' },
                    { 'N', 't' },
                    { 'T', 't' },
                    { 'A', 't' },
                    { ' ', 't' },
                    { 'Y', 't' },
                    { ' ', 't' },
                    { 'C', 't' },
                    { 'H', 't' },
                    { 'O', 't' },
                    { 'C', 't' },
                    { 'O', 't' },
                    { 'L', 't' },
                    { 'A', 't' },
                    { 'T', 't' },
                    { 'E', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
            },

            {
                    { 'B', 't' },
                    { 'U', 't' },
                    { 'S', 't' },
                    { 'C', 't' },
                    { 'A', 't' },
                    { ' ', 't' },
                    { 'T', 't' },
                    { 'R', 't' },
                    { 'A', 't' },
                    { 'B', 't' },
                    { 'A', 't' },
                    { 'J', 't' },
                    { 'O', 't' },
                    { ' ', 't' },
                    { 'P', 't' },
                    { 'E', 't' },
                    { 'D', 't' },
                    { 'A', 't' },
                    { 'Z', 't' },
                    { 'O', 't' },
                    { ' ', 't' },
                    { 'D', 't' },
                    { 'E', 't' },
                    { ' ', 't' },
                    { 'V', 't' },
                    { 'A', 't' },
                    { 'G', 't' },
                    { 'O', 't' },
                    { ' ', 't' },
                    { ' ', 't' },
            }

    };


    public static boolean getResuelto() {
        return resuelto;
    }

<<<<<<< HEAD
    /**
     * Este método escoge un panel al azar.
     */
=======
>>>>>>> 9e6b87d88dfe5726af2d6dbcc76a213d5dd02a31
    public static int elegirPanel() {
        int random;

        
        do {
            random = (int) (Math.random() * 4);
        } while ( panelesUsados.contains(random) );

        panelesUsados.add( random );
        return random;
    }

    /**
     * Este método muestra todas las letras del panel.
     */
    public static void mostrarPanel(int n) {
        for (int i = 0; i < paneles[n].length; i++) {

            if (i % 10 == 0)
                System.out.println("");
            // System.out.println(panel1[i][0]);
            if (paneles[n][i][1] == 'l' || paneles[n][i][0] == ' ') {
                System.out.print(paneles[n][i][0] + " ");
            } else {
                System.out.print("#" + " ");
            }

        }
        System.out.println("");
        System.out.println(pistas[n]);
        resuelto = estaResuelto(n);
    }

    /**
     * Este método permite al jugador la opcion de resolver el panel entero.
     */
    public static boolean resolverPanel( String cadena, int n ) {
<<<<<<< HEAD
        return ( cadena.equalsIgnoreCase(sol[n]) );
=======
        return (cadena.equalsIgnoreCase(sol[n]));
>>>>>>> 9e6b87d88dfe5726af2d6dbcc76a213d5dd02a31
    }

    /**
     * Este método cambia el estado de la letra escogida por el jugador
     * y cambia, y llama a mostrarPanel().
     */
    public static int buscarLetra(char letra, int n) {

        int contador = 0;

        for (int i = 0; i < paneles[n].length; i++) {

            if (Character.toLowerCase(paneles[n][i][0]) == Character.toLowerCase(letra)) {
                paneles[n][i][1] = 'l';
                contador++;
            }
        }
        mostrarPanel(n);
        return contador;
    }

    public static boolean estaResuelto(int n) {
        boolean r = true;
        for ( int i = 0; i < paneles[n].length; i++ ) {
            if( paneles[n][i][1] != 'l' ) r = false;
        }
        return r;
    }

    
}