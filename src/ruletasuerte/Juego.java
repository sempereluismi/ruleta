package ruletasuerte;

public class Juego {
    

    public void main() {

        

    } 

    private void mostrarMenu() {

        int opt = 0;
        do {
            System.out.println("1.- Jugar");
            System.out.println("2.- Añadir Jugadores");
            System.out.println("3.- Salir");

            switch (opt) {
                case 1:
                    jugar();
                    break;
                case 2:
                    jugadores();
                    break;
                case 3:
                    System.out.println("Adiós :)");
            }

        } while ( opt != 3 );
    }

    private void jugar() {

    }

    private void jugadores () {
        
    }
}   
