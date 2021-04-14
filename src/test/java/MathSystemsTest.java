import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class MathSystemsTest {

    @Test
    public void getResultTest() {
        MathSystems mathSystems = new MathSystems();
        Assertions.assertEquals(3.681, BigDecimal.valueOf(mathSystems.getResult(-3.603)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.018, BigDecimal.valueOf(mathSystems.getResult(5)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

    }
}
