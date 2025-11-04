package org.khodro;


// Mashin yek khodro ast : Car is a Vehicle
public class Mashin extends Khodoro{


        public Mashin(String mark){
            this.mark = mark;
        }

        //Variables
        boolean ayaDarBazAst;
        String mark;

        void bazKardanDar(){
            ayaDarBazAst = true;
        }

        void bastanDar(){
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
