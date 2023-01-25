package ruletasuerte;

import java.util.Scanner;

public class Juego {

    private String n1, n2, n3;
    private int numResueltos = 0, opt;
    private boolean continua;

    public void main() {

        

    } 

    private void mostrarMenu() {

        int opt = 0;
        do {
            System.out.println("1.- Jugar");
            System.out.println("2.- Salir");

            switch (opt) {
                case 1:
                    jugar();
                    break;
                case 2:
                    System.out.println("Adiós :)");
            }

        } while ( opt != 2 );
    }

    private void jugar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta los jugadores");
        jugadores();
        Jugador j1 = new Jugador(n1, true);
        Jugador j2 = new Jugador(n2, false);
        Jugador j3 = new Jugador(n3, false);
        
        while( numResueltos < 5 ) {
            while( j1.getJuega() ) {
                continua = j1.tirarRuleta();
                if( !continua ) j2.setJuega(true);
            }

            while( j2.getJuega() ) {
                continua = j2.tirarRuleta();
                if( !continua ) j3.setJuega(true);
            }

            while( j3.getJuega() ) {
                continua = j3.tirarRuleta();
                if( !continua ) j1.setJuega(true);

                System.out.println("Elige una opcion");
                System.out.println("1.- Tirar Ruleta");
                System.out.println("2.- comprar vocal");
                opt = Integer.valueOf(sc.nextLine());

                switch ( opt ) {
                    case 1:
                        j3.tirarRuleta();
                        break;
                    case 2:
                        j3.comprarVocal();
                        break;
                }
            }
        }
    }

/*
 * Pidiendo los nombres de los jugadores para crear la partida
 */
    private void jugadores () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el nombre del jugador 1");
        n1 = sc.nextLine();

        System.out.println("Inserta el nombre del jugador 2");
        n2 = sc.nextLine();
  
        System.out.println("Inserta el nombre del jugador 3");
        n3 = sc.nextLine();
        sc.close();
    }
}   
