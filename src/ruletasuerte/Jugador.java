package ruletasuerte;
import java.util.Scanner;

/*
 * @autor luis miguel
 */

/*
 * En esta clase creamos las opciones que tienen los jugadores durante una partida.
 */
public class Jugador {

    private int dinero = 0, dineroTotal = 0, comodin, aux;
    private boolean juega;
    private String nombre;

    public Jugador(String nombre, boolean juega) {
        this.nombre = nombre;
        this.juega = juega;
    }

    public void setDineroTotal(int d) {
        dineroTotal += d;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int d) {
        dinero = d;
    }

    public boolean getJuega() {
        return juega;
    }

    public void setJuega(boolean juega) {
        this.juega = juega;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Invoca el método de la clase ruleta de tirar y actua en consecuencia
     */
    public void tirarRuleta() {
        aux = Ruleta.tirar();

        switch (aux) {
            case -1:
                dinero = 0;
                System.out.println("QUIEBRA");
                System.out.println(nombre + " tiene " + dinero + "€");
                juega = false;
                break;
            case -2:
                System.out.println("PIERDES TURNO");
                System.out.println(nombre + " tiene " + dinero + "€");
                juega = false;
                break;
            case -3:
                comodin++;
                System.out.println("HAS GANADO UN COMODÍN");
                System.out.println(nombre + " tiene " + dinero + "€");
                juega = true;
                break;
            case -4: 
                dinero *= 2;
                System.out.println("HAS DOBLADO LO QUE TENÍAS");
                System.out.println(nombre + " tiene " + dinero + "€");
                juega = true;
                break;
            case -5: 
                dinero /= 2;
                System.out.println("EL DINERO SE HA DIVIDIDO ENTRE DOS");
                System.out.println(nombre + " tiene " + dinero + "€");
                juega = true;
                break;
            default:
                dinero += aux;
                System.out.println(nombre + " tiene " + dinero + "€");
                juega = true;
        }

    }

    public String opciones() {
        Scanner sc = new Scanner(System.in);
        String opt;
        System.out.println("Elige una opcion");
        System.out.println("1.- Tirar Ruleta");
        System.out.println("2.- Resolver Panel");
        System.out.println("3.- comprar vocal");
        opt = sc.nextLine();

        return opt;
    }

    /*
     * Este método usa el método de buscar letra condicionando el dinero y que sea
     * una vocal
     */
    public void comprarVocal() {
        Scanner s = new Scanner(System.in);
        String l;
        char vocal;
        int aux = 0;
        if (dinero >= 100) {

            System.out.println("ingresa una vocal");
            l = s.nextLine();
            vocal = Character.toLowerCase(l.charAt(0));
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                dinero -= 50;
                aux = Tarjetas.buscarLetra(vocal, Juego.getPanel());
                if (aux == 0) {
                    System.out.println("ohhhhhh fallaste :( pierdes turno");
                    juega = false;
                }
            } else {
                System.out.println("No es una vocal");
                comprarVocal();
            }

        } else {
            System.out.println("Tienes menos de 100 €");
        }
    }

    /*
     * Este método añade una letra que elija el jugador
     */
    public void pedirLetra() {
        Scanner s = new Scanner(System.in);
        String l;
        char letra;
        int aux;

        System.out.println("ingresa una letra");
        l = s.nextLine();
        letra = l.charAt(0);
        /*
         * El método buscar letra retorna el numero de letras acertadas dependiendo de
         * si acierta o no
         */
        aux = Tarjetas.buscarLetra(letra, Juego.getPanel());

        // si tiene un comodín no pierde el turno
        if (aux == 0) {
            if (comodin > 0) {
                comodin--;
                System.out.println("Tienes comodín no pierdes turno");
            } else {
                juega = false;
            }
        }

    }

}
