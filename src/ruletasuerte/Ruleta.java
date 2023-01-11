package ruletasuerte;

/**
 *
 * @author a22luismsg
 */
public class Ruleta {
    
    /*
    OPCIONES DE LA RULETA:
    1: quiebra
    2: pierde turno
    3: comodín
    102: x2
    12: 1/2
    */
    private final static int [] Ruleta = {200, 1, 102, 100, 50, 100, 150, 2, 150, 100, 50, 100, 200, 50, 150, 12, 50, 150, 100, 3, 150, 100, 50, 100};
    private static int premio = 1;
    
    public static void tirar() {
        int opt = (int)(Math.random()*24);
        
        switch (Ruleta[opt]) {
            case 1:
                System.out.println("QUIEBRA");
                break;
            case 2:
                System.out.println("PIERDE TURNO");
                break;
            case 3:
                System.out.println("COMODÍN");
                break;
            case 102:
                System.out.println("x2");
                premio *= 2;
                break;
            case 12:
                System.out.println("1/2");
                premio /= 2;
                break;
            default:
                premio += Ruleta[opt];
        }
        
        
        System.out.println(premio);
    }
    
    
}
