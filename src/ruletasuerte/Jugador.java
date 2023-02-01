package ruletasuerte;



import java.util.Scanner;

/*
 * @autor luis miguel
 */

/*
 * En esta clase creamos las opciones que tienen los jugadores durante una partida.
 */
public class Jugador {
    
    private int dinero = 0, comodin, aux;
    private boolean juega;
    private String nombre;

    public Jugador( String nombre, boolean juega ) {
        this.nombre = nombre;
        this.juega = juega;
    }

    public boolean getJuega() {
        return juega;
    }

    public void setJuega( boolean juega ) {
        this.juega = juega;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Invoca el método de la clase ruleta de tirar y actua en consecuencia
     */
    public boolean tirarRuleta() {
        aux = Ruleta.tirar();

        switch( aux ) {
            case -1:
                dinero = 0;
                juega = false;
                System.out.println(nombre + " tiene " + dinero + "€");
                return false;
                
            case -2: 
                juega = false;
                System.out.println(nombre + " tiene " + dinero + "€");
                return false;
            case -3:
                comodin++;
                System.out.println(nombre + " tiene " + dinero + "€");
                return true;
            default:
                dinero += aux;
                System.out.println(nombre + " tiene " + dinero + "€");
                return true;
        }

        

    }


    /*
     * Este método usa el método de buscar letra condicionando el dinero y que sea una vocal
     */
    public void comprarVocal() {
        Scanner s = new Scanner(System.in);
        String l;
        char vocal;
        int aux = 0;
        if( dinero >= 100 ) {
            
            System.out.println("ingresa una vocal");
            l = s.nextLine();
            vocal = Character.toLowerCase(l.charAt(0));
            if( vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                dinero -= 50;
                aux = Tarjetas.buscarLetra(vocal, Juego.getPanel());
                if( aux == 0 ) {
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
        letra = Character.toLowerCase(l.charAt(0));
        /*
         * El método buscar letra retorna el numero de letras acertadas dependiendo de si acierta o no
         */
        aux = Tarjetas.buscarLetra(letra, Juego.getPanel());

        //si tiene un comodín no pierde el turno
        if( comodin > 0 && aux == 0 ) {
            System.out.println("Tienes comodín no pierdes turno");
        } else {
            System.out.println("ohhhhhh fallaste :( pierdes turno");
            juega = false;
        }

        System.out.println(juega);
    }

}
