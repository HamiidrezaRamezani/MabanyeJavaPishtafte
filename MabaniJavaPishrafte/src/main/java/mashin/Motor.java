package mashin;

import static java.lang.System.out;

public class Motor {

    boolean ayaRoshanAst;



    public void roshan() {
        out.println("mashin.Mashin roshan ast");
        ayaRoshanAst = true;
    }


    void khamoush() {
        out.println("mashin.Mashin khamoush ast");
        ayaRoshanAst = false;
    }

    public boolean ayaDarHarekatAst() {
        return ayaRoshanAst;
    }

}
