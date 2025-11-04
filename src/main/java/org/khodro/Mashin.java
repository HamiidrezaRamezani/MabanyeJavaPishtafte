package org.khodro;

public class Mashin {


        public Mashin(String mark){
            this.mark = mark;
        }

        //Variables
        boolean ayaRoshanAst;
        public boolean ayaDarBazAst;
        String mark;

        public void roshan(){
            ayaRoshanAst = true;
        }

        void khamosh(){
            ayaRoshanAst = false;
        }

        void bazKardanDar(){
            ayaDarBazAst = true;
        }

        public void bastanDar(){
            ayaDarBazAst = false;
        }


        public boolean ayaDarHarekatAst(){
            if(!ayaDarBazAst && ayaRoshanAst){
                return true;
            }else{
                return false;
            }
        }

}
