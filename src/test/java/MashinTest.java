import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.khodro.Mashin;

public class MashinTest {


    @Test
    void mashin_bayad_harekat_konad_vaghti_mashin_roshan_ast_va_dar_baste_ast() {

        //Given
        Mashin benz = new Mashin("Benz");
        //When
        benz.bastanDar();
        benz.roshan();

        boolean ayaBenzDarHarekatAst = benz.ayaDarHarekatAst();
        //Then

        Assertions.assertFalse(benz.ayaDarBazAst);
        Assertions.assertTrue(ayaBenzDarHarekatAst);

    }


}