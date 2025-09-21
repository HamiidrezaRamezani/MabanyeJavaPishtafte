import static java.lang.System.out;

class Mashin {

    // constructure
    Mashin() {
        out.println("Yek Mashin bdeone dade sakhte shod");
    }

    Mashin(String mark) {
        this.mark = mark;
    }

    boolean ayaMashinRoshanAst;
    boolean ayaDarMashinBazAst;
    double toul;
    double arz;
    String mark;

    void roshan() {
        out.println("Mashin roshan ast");
        ayaMashinRoshanAst = true;
    }

    void khamoush() {
        out.println("Mashin khamoush ast");
        ayaMashinRoshanAst = false;
    }

    void bazKardanDar() {
        out.println("Dar Baz ast");
        ayaDarMashinBazAst = true;
    }

    void bastanDar() {
        out.println("Dar Baste shod");
        ayaDarMashinBazAst = false;
    }


    boolean ayaMashinDarHarekatAst() {
        if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
            out.println("MashinDarHaleHarekatAst");
            return true;
        } else {
            out.println("Mashin Park ast");
            return false;
        }
    }


}


