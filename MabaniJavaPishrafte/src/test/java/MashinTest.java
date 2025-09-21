import mashin.Mashin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MashinTest {


    @Test
    void Mashin_Bayad_harekat_konad_vaghty_dar_baste_ast_va_mashin_roshan_ast() {


        // Given

        Mashin mashin = new Mashin("benz");
        Mashin mashin1 = new Mashin("volvo");


        // When

        boolean ayaHarekatMikonad = mashin.ayaDarHarekatAst();

        mashin1.roshan();
        boolean ayaVolvoHarekatMikonad = mashin1.ayaDarHarekatAst();
        // Then

        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);


    }



}
