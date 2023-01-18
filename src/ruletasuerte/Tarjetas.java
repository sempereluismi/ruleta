package ruletasuerte;

/**
 *
 * @author a22adriancs
 */

public class Tarjetas {

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
        },

        {
            { 'T', 't' },
            { 'O', 't' },
            { 'M', 't' },
            { 'A', 't' },
            { ' ', 't' },
            { 'G', 't' },
            { 'E', 't' },
            { 'R', 't' },
            { 'O', 't' },
            { 'M', 't' },
            { 'A', 't' },
            { ' ', 't' },
            { 'P', 't' },
            { 'A', 't' },
            { 'S', 't' },
            { 'T', 't' },
            { 'I', 't' },
            { 'L', 't' },
            { 'L', 't' },
            { 'A', 't' },
            { 'S', 't' },
            { ' ', 't' },
            { 'D', 't' },
            { 'E', 't' },
            { ' ', 't' },
            { 'G', 't' },
            { 'O', 't' },
            { 'M', 't' },
            { 'A', 't' },
            { ' ', 't' },
        },

    };

    /**
     * Este método muestra todas las letras del panel.
     */
    public static void mostrarPanel() {
        for (int i = 0; i < paneles[0].length; i++) {

            if( i % 10 == 0) System.out.println("");
            // System.out.println(panel1[i][0]);
            if (paneles[0][i][1] == 'l' || paneles[0][i][0] == ' ') {
                System.out.print(paneles[0][i][0] + " ");
            }else {
                System.out.print("+" + " ");
            }


        }
        System.out.println("");
    }
 
    /**
     * Este método cambia el estado de la letra escogida por el jugador
     * y cambia, y llama a mostrarPanel().
     */
    public static boolean buscarLetra( char letra ) {

        boolean acierto = false;

        for( int i = 0; i < paneles[0].length; i++ ) {
            
            if( Character.toLowerCase(paneles[0][i][0]) == Character.toLowerCase(letra) ) {
                paneles[0][i][1] = 'l';
                acierto = true;
            }
        }
        mostrarPanel();
        return acierto;
    }

}