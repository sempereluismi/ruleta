package ruletasuerte;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * En esta clase implementamos los menús para el funcionamiento del programa por parte del usuario.
 */
public class Juego {

    private String opt, nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private int numResueltos = 0;
    private boolean continua, resuelto;
    private static int panel = 0;

    public static int getPanel () {
        return panel;
    }
    
    public void main() {
        mostrarMenu();
    }

    /*
    * Mostramos el menú para el usuario
     */
    private void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.- Jugar");
            System.out.println("2.- Salir");
            opt = sc.nextLine();

            switch (opt.charAt(0)) {
                case '1':
                    if( jugadores.size() != 3) {
                        jugadores();
                    } else {
                        jugar();
                    }
                    break;
                case '2':
                    System.out.println("Adiós :)");
            }

        } while (opt.charAt(0) != '2');
    }

    private void jugar() {
        panel = Tarjetas.elegirPanel();
        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i < jugadores.size(); i++ ){
            if( i == 0 ) {
                jugadores.get(i).setJuega(true);
            } else {
                jugadores.get(i).setJuega(false);
            }
        }

        

        while (numResueltos < 5) {

            for ( int i = 0; i < jugadores.size(); i++ ){
                while ( jugadores.get(i).getJuega() ) {
                    System.out.println("Turno de " + jugadores.get(i).getNombre());
                    jugadores.get(i).tirarRuleta();

                    if ( jugadores.get(i).getJuega() ) {
                        opt = jugadores.get(i).opciones();
                    } else {
                        System.out.println("A partir d aqui deberia fucar");
                        System.out.println(i);
                        if( i == 2 ) {
                            jugadores.get(0).setJuega(true);
                        } else {
                            jugadores.get(i+1).setJuega(true);
                        }
                    }
    
    
                    switch (opt.charAt(0)) {
                        case '1':
                            jugadores.get(i).tirarRuleta();
                            if( Tarjetas.estaResuelto( Juego.getPanel() )) {
                                numResueltos++;
                                jugadores.get(i).setDineroTotal( jugadores.get(i).getDinero() );
                                jugadores.get(i).setDinero(0);
                                System.out.println("HAS RESUELTO EL PANEL");
                                System.out.println("HAS GANADO " + jugadores.get(i).getDinero() + "€");
                                jugar();
                            }
                            break;
                        case '2':
                            System.out.println("Escribe el panel");
                            String str = sc.nextLine();
                            resuelto = Tarjetas.resolverPanel(str, panel);
                            if(resuelto) {
                                numResueltos++;
                                jugadores.get(i).setDineroTotal( jugadores.get(i).getDinero() );
                                jugadores.get(i).setDinero(0);
                                System.out.println("HAS RESUELTO EL PANEL");
                                System.out.println("HAS GANADO " + jugadores.get(i).getDinero() + "€");
                                jugar();
                            }
                            break;
                        case '3':
                            jugadores.get(i).comprarVocal();
                            if(Tarjetas.estaResuelto( Juego.getPanel() )) {
                                numResueltos++;
                                jugadores.get(i).setDineroTotal( jugadores.get(i).getDinero() );
                                jugadores.get(i).setDinero(0);
                                System.out.println("HAS RESUELTO EL PANEL");
                                System.out.println("HAS GANADO " + jugadores.get(i).getDinero() + "€");
                                jugar();
                            }
                            break;
                    }
                }
            }
            

 
        }
    }

    /*
     * Pidiendo los nombres de los jugadores para crear la partida
     */
    private void jugadores() {
        Scanner sc = new Scanner(System.in);

        for( int i = 0; i < 3; i++ ) {
            System.out.println("Inserta el nombre del jugador " + (i+1));
            nombre = sc.nextLine();
            jugadores.add(new Jugador(nombre, false));
        }

        jugar();
    }
}
