import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MashinTest{


    @Test
    void mashin_bayad_harekat_konad_vaghti_mashin_roshan_ast_va_dar_baste_ast() {


        Mashin mashin = new Mashin();




        //Given
        Mashin benz = new Mashin("Benz");
        //When
        benz.bastanDar();
        benz.roshan();

        boolean ayaBenzDarHarekatAst = benz.ayaMashinDarHarekatAst();
        //Then

        Assertions.assertFalse(benz.ayaDarMashinBazAst);
        Assertions.assertTrue(ayaBenzDarHarekatAst);

    }

    class Mashin{


        Mashin(){
            System.out.println("Constructor without any things");
        }


        Mashin(String mark){
            this.mark = mark;
            System.out.println("Yek mashin ba name: " + mark + " sakhte shod!");
        }

        //Variables
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        String mark;

        void roshan(){
            ayaMashinRoshanAst = true;
            System.out.println("Mashin roshan ast");
        }

        void khamosh(){
            System.out.println("Mashin khamosh ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar(){
            System.out.println("Dar baz shod");
            ayaDarMashinBazAst = true;
        }

        void bastanDar(){
            System.out.println("Dae basste shod");
            ayaDarMashinBazAst = false;
        }


        boolean ayaMashinDarHarekatAst(){
            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin dar hal harekat ast");
                return true;
            }else{
                System.out.println("Mashin park ast");
                return false;
            }
        }
    }
}