package org.khodro;

public class Motor {
    public boolean ayaRoshanAst;

    public void roshan(){
        ayaRoshanAst = true;
    }

    public void khamosh(){
        ayaRoshanAst = false;
    }

    public boolean ayaDarHarekatAst(){
        return ayaRoshanAst;
    }
}

