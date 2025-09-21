package mashin;

import static java.lang.System.out;

public class Mashin extends Khodro{

    // Don't repeat yourself

    // constructure
    Mashin() {
        out.println("Yek mashin.Mashin bdeone dade sakhte shod");
    }

    public Mashin(String mark) {
        this.mark = mark;
    }

    boolean ayaDarBazAst;
    double toul;
    double arz;
    String mark;


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


