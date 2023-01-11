package ruletasuerte;

/*
 * @autor luis miguel
 */

public class Jugador {
    
    private int dinero = 0, comodin;
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

}
