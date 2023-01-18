package ruletasuerte;

import javax.security.auth.callback.TextInputCallback;


import java.util.Scanner;

/*
 * @autor luis miguel
 */

public class Jugador {
    
    private int dinero = 1000, comodin;
    private boolean juega;
    private String nombre;

    public Jugador( String nombre, boolean juega ) {
        this.nombre = nombre;
        this.juega = juega;
    }

    /**
     * Invoca el método de la clase ruleta de tirar y actua en consecuencia
     */
    public void tirarRuleta() {
        Ruleta r = new Ruleta();
        dinero = r.tirar();

        switch( dinero ) {
            case -1:
                dinero = 0;
                juega = false;
                break;
            case -2: 
                juega = false;
                break;
            case -3:
                comodin++;
                break;
        }
    }


    /*
     * Este método usa el método de buscar letra condicionando el dinero y que sea una vocal
     */
    public void comprarVocal() {
        Scanner s = new Scanner(System.in);
        String l;
        char vocal;
        if( dinero >= 100 ) {
            
            System.out.println("ingresa una vocal");
            l = s.nextLine();
            vocal = Character.toLowerCase(l.charAt(0));
            
            if( vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                dinero -= 50;
                Tarjetas.buscarLetra(vocal);
            } else {
                System.out.println("No es una vocal");
                comprarVocal();
            }

        } else {
            System.out.println("Tienes menos de 100 €");
        }
    }

    public void pedirLetra() {
        Scanner s = new Scanner(System.in);
        String l;
        char letra;
        boolean aux;
        
        System.out.println("ingresa una letra");
        l = s.nextLine();
        letra = Character.toLowerCase(l.charAt(0));

        /*
         * El método buscar letra retorna true o false dependiendo de si acierta o no
         */
        aux = Tarjetas.buscarLetra(letra);

        //si tiene un comodín no pierde el turno
        if( comodin > 0 && !aux ) {
            System.out.println("Tienes comodín no pierdes turno");
        } else {
            System.out.println("ohhhhhh fallaste :( pierdes turno");
            juega = false;
        }

        System.out.println(juega);
    }

}
