import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;


public class LogarithmsTest {

    @Test
    public void testNaturalLogarithm() {
        Logarithms logarithmsSpy = new Logarithms();

        Assertions.assertEquals(0, logarithmsSpy.calculateLn(1.0));

        Assertions.assertEquals(Double.NaN, logarithmsSpy.calculateLn(0.0));

        Assertions.assertEquals(Double.NaN, logarithmsSpy.calculateLn(-1.0));

        Assertions.assertEquals( -0.223, BigDecimal.valueOf(logarithmsSpy.calculateLn(0.8)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Assertions.assertEquals(-2.120, BigDecimal.valueOf(logarithmsSpy.calculateLn(0.12)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Assertions.assertEquals(1.099, BigDecimal.valueOf(logarithmsSpy.calculateLn(3.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Assertions.assertEquals(1.386, BigDecimal.valueOf(logarithmsSpy.calculateLn(4.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    @Test
    public void testModuleLogarithmSecondBase() {
        Logarithms logarithmsSpy = Mockito.spy(Logarithms.class);
        //Проверка ln1=0
        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(1.0))).thenReturn(0.0);
        Assertions.assertEquals(0, logarithmsSpy.calculateLog2(1));
        //Проверка ln0=infinity
        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(0.0))).thenReturn(Double.NaN);
        Assertions.assertEquals(Double.NaN, logarithmsSpy.calculateLog2(0));

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(-1.0))).thenReturn(Double.NaN);
        Assertions.assertEquals(Double.NaN, logarithmsSpy.calculateLog2(-1.0));

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(0.44))).thenReturn(-0.821);
        Assertions.assertEquals(-1.184, BigDecimal.valueOf(logarithmsSpy.calculateLog2(0.44)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(0.67))).thenReturn(-0.4);
        Assertions.assertEquals(-0.577, BigDecimal.valueOf(logarithmsSpy.calculateLog2(0.67)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(5.33))).thenReturn(1.673);
        Assertions.assertEquals(2.414, BigDecimal.valueOf(logarithmsSpy.calculateLog2(5.33)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    @Test
    public void testModuleLogarithmThirdBase() {
        Logarithms logarithmsSpy = Mockito.spy(Logarithms.class);

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(1.0))).thenReturn(0.0);
        Assertions.assertEquals(0, logarithmsSpy.calculateLog3(1));

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(0.0))).thenReturn(Double.NaN);
        Assertions.assertEquals(Double.NaN, logarithmsSpy.calculateLog3(0));

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(-1.0))).thenReturn(Double.NaN);
        Assertions.assertEquals(Double.NaN, logarithmsSpy.calculateLog3(-1.0));


        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(0.22))).thenReturn(-1.514);
        Assertions.assertEquals(-1.378, BigDecimal.valueOf(logarithmsSpy.calculateLog3(0.22)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(0.99))).thenReturn(-0.01);
        Assertions.assertEquals(-0.009, BigDecimal.valueOf(logarithmsSpy.calculateLog3(0.99)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(1.10))).thenReturn(0.0953);
        Assertions.assertEquals(0.087, BigDecimal.valueOf(logarithmsSpy.calculateLog3(1.10)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());


    }

    @Test
    public void testModuleLogarithmFifthBase() {
        Logarithms logarithmsSpy = Mockito.spy(Logarithms.class);

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(1.0))).thenReturn(0.0);
        Assertions.assertEquals(0, logarithmsSpy.calculateLog5(1));

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(0.0))).thenReturn(Double.NaN);
        Assertions.assertEquals(Double.NaN, logarithmsSpy.calculateLog5(0));

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(-1.0))).thenReturn(Double.NaN);
        Assertions.assertEquals(Double.NaN, logarithmsSpy.calculateLog5(-1.0));

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(0.33))).thenReturn(-1.108);
        Assertions.assertEquals(-0.688, BigDecimal.valueOf(logarithmsSpy.calculateLog5(0.33)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(logarithmsSpy.calculateLn(Mockito.eq(7.0))).thenReturn(1.9459);
        Assertions.assertEquals(1.209, BigDecimal.valueOf(logarithmsSpy.calculateLog5(7.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());




    }


    @Test
    public void integrateTestLogarithms() {
        Logarithms logarithms = new Logarithms();

        Assertions.assertEquals(Double.NaN, logarithms.calculateLog2(0.0));
        Assertions.assertEquals(Double.NaN, logarithms.calculateLog3(0.0));
        Assertions.assertEquals(Double.NaN, logarithms.calculateLog5(0.0));

        Assertions.assertEquals(Double.NaN, logarithms.calculateLog2(-1.0));
        Assertions.assertEquals(Double.NaN, logarithms.calculateLog3(-1.0));
        Assertions.assertEquals(Double.NaN, logarithms.calculateLog5(-1.0));

        Assertions.assertEquals(Double.NaN, logarithms.calculateLog2(Double.NEGATIVE_INFINITY));
        Assertions.assertEquals(Double.NaN, logarithms.calculateLog3(Double.NEGATIVE_INFINITY));
        Assertions.assertEquals(Double.NaN, logarithms.calculateLog5(Double.NEGATIVE_INFINITY));

        Assertions.assertEquals(Double.NaN, logarithms.calculateLog2(Double.NaN));
        Assertions.assertEquals(Double.NaN, logarithms.calculateLog3(Double.NaN));
        Assertions.assertEquals(Double.NaN, logarithms.calculateLog5(Double.NaN));


        Assertions.assertEquals(-2.737, BigDecimal.valueOf(logarithms.calculateLog2(0.15)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.862, BigDecimal.valueOf(logarithms.calculateLog2(0.55)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.044, BigDecimal.valueOf(logarithms.calculateLog2(0.97)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0, logarithms.calculateLog2(1));
        Assertions.assertEquals(0.705, BigDecimal.valueOf(logarithms.calculateLog2(1.63)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(2, BigDecimal.valueOf(logarithms.calculateLog2(4)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(3.134, BigDecimal.valueOf(logarithms.calculateLog2(8.78)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Assertions.assertEquals(-2.009, BigDecimal.valueOf(logarithms.calculateLog3(0.11)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.834, BigDecimal.valueOf(logarithms.calculateLog3(0.4)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.25, BigDecimal.valueOf(logarithms.calculateLog3(0.76)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0, logarithms.calculateLog3(1));
        Assertions.assertEquals(1.262, BigDecimal.valueOf(logarithms.calculateLog3(4)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.69, BigDecimal.valueOf(logarithms.calculateLog3(6.4)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.904, BigDecimal.valueOf(logarithms.calculateLog3(8.1)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Assertions.assertEquals(-1.317, BigDecimal.valueOf(logarithms.calculateLog5(0.12)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.317, BigDecimal.valueOf(logarithms.calculateLog5(0.6)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.013, BigDecimal.valueOf(logarithms.calculateLog5(0.98)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0, logarithms.calculateLog5(1));
        Assertions.assertEquals(0.33, BigDecimal.valueOf(logarithms.calculateLog5(1.7)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.113, BigDecimal.valueOf(logarithms.calculateLog5(6)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.544, BigDecimal.valueOf(logarithms.calculateLog5(12)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

}