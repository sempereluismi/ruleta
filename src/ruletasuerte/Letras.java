package ruletasuerte;
//hacer un array doble con la cantidad de letras del abecedario y despues hacer un char
/**
 *
 * @author a22adriancs
 */

/*
 * En esta clase implementamos todas las letras para que el programa sepa que hacer cuando un jugador seleccione una.
 */
public class Letras {

    /*
     * l de libre
     * t de tachado
     */
    private char[][] letra = {{'a', 't'}, {'b', 't'}, {'c', 't'}, {'d', 't'}, {'e', 't'}, {'f', 't'}, {'g', 't'}, {'h', 't'}, {'i', 't'}, {'j', 't'}, {'k', 't'}, {'l', 't'}, {'m', 't'}, {'n', 't'}, {'ñ', 't'}, {'o', 't'}, {'p', 't'}, {'q', 't'}, {'r', 't'}, {'s', 't'}, {'t', 't'}, {'u', 't'}, {'v', 't'}, {'w', 't'}, {'x', 't'}, {'y', 't'}, {'z', 'l'}};

    /*
     * Mostramos las letras ingresadas en el array
     */
    public void mostrarLetras() {
        for( int i = 0; i < 27; i++ ) {
            if( letra[i][1] == 'l' ) System.out.println(letra[i][0]);
        }
    }

    /*
     * Modificamos la posicion de las letras y mostramos el cambio
     */
    public void modificarLetra( int posicion, char l ) {
        letra[posicion][1] = l;
        mostrarLetras();
    }
}