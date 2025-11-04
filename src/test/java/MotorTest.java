import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.khodro.Motor;

public class MotorTest {
    @Test
    void motor_bayad_harekat_konad_vaghti_roshan_ast() {


        //Given

        Motor motor = new Motor();
        //When

        motor.roshan();
        boolean ayaMotorDarHarekatAst = motor.ayaDarHarekatAst();

        //Then

        Assertions.assertTrue(ayaMotorDarHarekatAst);

    }
}
