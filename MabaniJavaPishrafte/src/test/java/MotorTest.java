import mashin.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {
    @Test
    void motor_bayad_harekat_konad_vaghti_roshan_ast() {

        // Given

        Motor motor = new Motor();

        // When

        motor.roshan();
        boolean aya_dar_harekat_ast = motor.ayaDarHarekatAst();


        // Then

        Assertions.assertTrue(aya_dar_harekat_ast);
    }
}
