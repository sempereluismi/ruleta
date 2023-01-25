package ruletasuerte;

import java.util.Scanner;

/*
 * En esta clase implementamos los menús para el funcionamiento del programa por parte del usuario.
 */
public class Juego {

    private String n1, n2, n3, opt;
    private int numResueltos = 0;
    private boolean continua;

    public void main() {
        mostrarMenu();
    }

    private void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.- Jugar");
            System.out.println("2.- Salir");
            opt = sc.nextLine();

            switch (opt.charAt(0)) {
                case '1':
                    jugar();
                    break;
                case '2':
                    System.out.println("Adiós :)");
            }

        } while (opt.charAt(0) != '2');
    }

    private void jugar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta los jugadores");
        jugadores();
        Jugador j1 = new Jugador(n1, true);
        Jugador j2 = new Jugador(n2, false);
        Jugador j3 = new Jugador(n3, false);

        while (numResueltos < 5) {
            while (j1.getJuega()) {
                System.out.println("Turno de " + j1.getNombre());
                continua = j1.tirarRuleta();
                if (!continua) j2.setJuega(true);

                System.out.println("Elige una opcion");
                System.out.println("1.- Tirar Ruleta");
                System.out.println("2.- Resolver Panel");
                System.out.println("3.- comprar vocal");
                opt = sc.nextLine();

                switch (opt.charAt(0)) {
                    case '1':
                        j1.tirarRuleta();
                        break;
                    case '2':
                        System.out.println("Escribe el panel");
                        String str = sc.nextLine();
                        Tarjetas.resolverPanel(str, Ruleta.getPanel());
                        break;
                    case '3':
                        j1.comprarVocal();
                        break;
                }
            }

            while (j2.getJuega()) {
                System.out.println("Turno de " + j2.getNombre());
                continua = j2.tirarRuleta();
                if (!continua) j3.setJuega(true);

                System.out.println("Elige una opcion");
                System.out.println("1.- Tirar Ruleta");
                System.out.println("2.- Resolver Panel");
                System.out.println("3.- comprar vocal");
                opt = sc.nextLine();

                switch (opt.charAt(0)) {
                    case '1':
                        j1.tirarRuleta();
                        break;
                    case '2':
                        System.out.println("Escribe el panel");
                        String str = sc.nextLine();
                        Tarjetas.resolverPanel(str, Ruleta.getPanel());
                        break;
                    case '3':
                        j1.comprarVocal();
                        break;
                }
            }

            while (j3.getJuega()) {
                System.out.println("Turno de " + j3.getNombre());
                continua = j3.tirarRuleta();
                if (!continua) j1.setJuega(true);

                System.out.println("Elige una opcion");
                System.out.println("1.- Tirar Ruleta");
                System.out.println("2.- Resolver Panel");
                System.out.println("3.- comprar vocal");
                opt = sc.nextLine();

                switch (opt.charAt(0)) {
                    case '1':
                        j3.tirarRuleta();
                        break;
                    case '2':
                        System.out.println("Escribe el panel");
                        String str = sc.nextLine();
                        Tarjetas.resolverPanel(str, Ruleta.getPanel());
                        break;
                    case '3':
                        j3.comprarVocal();
                        break;
                }
            }
        }
    }

    /*
     * Pidiendo los nombres de los jugadores para crear la partida
     */
    private void jugadores() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el nombre del jugador 1");
        n1 = sc.nextLine();

        System.out.println("Inserta el nombre del jugador 2");
        n2 = sc.nextLine();

        System.out.println("Inserta el nombre del jugador 3");
        n3 = sc.nextLine();
    }
}
