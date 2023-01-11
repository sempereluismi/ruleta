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

    private int [] ruleta = {200, 1, 102, 100, 50, 100, 150, 2, 150, 100, 50, 100, 200, 50, 150, 12, 50, 150, 100, 3, 150, 100, 50, 100};
    private int premio;

    public Ruleta() {
        this.premio = 0;
    }

    
    
    public int tirar() {
        premio = 0;
        int opt = (int)(Math.random()*24);
        
        switch (this.ruleta[opt]) {
            case 1:
                return -1;
            case 2:
                return -2;
            case 3:
                return -3;
            case 102:
                System.out.println("x2");
                premio *= 2;
                break;
            case 12:
                System.out.println("1/2");
                premio /= 2;
                break;
            default:
                premio += ruleta[opt];
        }
        
        
        return premio;
    }
    
    
}
