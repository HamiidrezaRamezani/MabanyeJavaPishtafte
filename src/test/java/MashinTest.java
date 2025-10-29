public class MashinTest{

    class Mashin{


        //Variables
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;

        void roshan(){
            System.out.println("Mashin roshan ast");
        }

        void khamosh(){
            System.out.println("Mashin khamosh ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar(){
            System.out.println("Dar baz shod");
            ayaMashinRoshanAst = true;
        }

        void bastanDar(){
            System.out.println("Dae basste shod");
            ayaDarMashinBazAst = false;
        }


        void harekat(){
            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin dar hal harekat ast");
            }else{
                System.out.println("Mashin park ast");
            }
        }
    }
}