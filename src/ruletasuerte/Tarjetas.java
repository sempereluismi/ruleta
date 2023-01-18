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