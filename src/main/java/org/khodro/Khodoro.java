package org.khodro;

public abstract class Khodoro {

    public boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }

    public void khamosh(){
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHarekatAst();


}
