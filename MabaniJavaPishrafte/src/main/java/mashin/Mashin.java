package mashin;

import static java.lang.System.out;

public class Mashin {

    // Don't repeat yourself

    // constructure
    Mashin() {
        out.println("Yek mashin.Mashin bdeone dade sakhte shod");
    }

    public Mashin(String mark) {
        this.mark = mark;
    }

    boolean ayaRoshanAst;
    boolean ayaDarBazAst;
    double toul;
    double arz;
    String mark;

    public void roshan() {
        out.println("mashin.Mashin roshan ast");
        ayaRoshanAst = true;
    }

    void khamoush() {
        out.println("mashin.Mashin khamoush ast");
        ayaRoshanAst = false;
    }

    void bazKardanDar() {
        out.println("Dar Baz ast");
        ayaDarBazAst = true;
    }

    void bastanDar() {
        out.println("Dar Baste shod");
        ayaDarBazAst = false;
    }


    public boolean ayaDarHarekatAst() {
        if (!ayaDarBazAst && ayaRoshanAst) {
            out.println("MashinDarHaleHarekatAst");
            return true;
        } else {
            out.println("mashin.Mashin Park ast");
            return false;
        }
    }


}


