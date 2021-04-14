import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;


class TrigonometricFunctionsTest {

    @Test
    public void testSin() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
        Assertions.assertEquals(Double.NaN, trigonometricFunctions.getSin(Double.NaN));
        Assertions.assertEquals(Double.NaN, trigonometricFunctions.getSin(Double.NEGATIVE_INFINITY));

        Assertions.assertEquals(0, BigDecimal.valueOf(trigonometricFunctions.getSin(0.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.262, BigDecimal.valueOf(trigonometricFunctions.getSin(50.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.774, BigDecimal.valueOf(trigonometricFunctions.getSin(70.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.841, BigDecimal.valueOf(trigonometricFunctions.getSin(1.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.959, BigDecimal.valueOf(trigonometricFunctions.getSin(-5.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

    }

    @Test
    public void testCos() {
        TrigonometricFunctions trigonometricFunctionsSpy = Mockito.spy(TrigonometricFunctions.class);

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(0.0))).thenReturn(0.0);
        Assertions.assertEquals(1, trigonometricFunctionsSpy.getCos(0.0));

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(-3.14))).thenReturn(0.0);
        Assertions.assertEquals(-1, trigonometricFunctionsSpy.getCos(-3.14));

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(-1.57))).thenReturn(-1.0);
        Assertions.assertEquals(0, trigonometricFunctionsSpy.getCos(-1.57));

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(1.57))).thenReturn(1.0);
        Assertions.assertEquals(0, trigonometricFunctionsSpy.getCos(1.57));

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(3.14))).thenReturn(0.0);
        Assertions.assertEquals(-1, trigonometricFunctionsSpy.getCos(3.14));

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(-0.8))).thenReturn(-0.717);
        Assertions.assertEquals(0.697, BigDecimal.valueOf(trigonometricFunctionsSpy.getCos(-0.8)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(2.48))).thenReturn(0.614);
        Assertions.assertEquals(-0.789, BigDecimal.valueOf(trigonometricFunctionsSpy.getCos(2.48)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());


    }

    @Test
    public void testCot() {
        TrigonometricFunctions trigonometricFunctionsSpy = Mockito.spy(TrigonometricFunctions.class);

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(0.165))).thenReturn(0.98641);
        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(0.165))).thenReturn(0.16425);
        Assertions.assertEquals(6.006, BigDecimal.valueOf(trigonometricFunctionsSpy.getCot(0.165)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(0.465))).thenReturn(0.893821);
        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(0.465))).thenReturn(0.448422);
        Assertions.assertEquals(1.993, BigDecimal.valueOf(trigonometricFunctionsSpy.getCot(0.465)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());


        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(2.2))).thenReturn(-0.5885);
        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(2.2))).thenReturn(0.8084);
        Assertions.assertEquals(-0.728, BigDecimal.valueOf(trigonometricFunctionsSpy.getCot(2.2)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(0.0))).thenReturn(0.0);
        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(0.0))).thenReturn(1.0);
        Assertions.assertEquals(Double.NaN, trigonometricFunctionsSpy.getCot(0.0));
    }

    @Test
    public void testSec() {
        TrigonometricFunctions trigonometricFunctionsSpy = Mockito.spy(TrigonometricFunctions.class);

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(-1.47))).thenReturn(0.100626);
        Assertions.assertEquals(9.938, BigDecimal.valueOf(trigonometricFunctionsSpy.getSec(-1.47)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(-0.6))).thenReturn(0.8253);
        Assertions.assertEquals(1.212, BigDecimal.valueOf(trigonometricFunctionsSpy.getSec(-0.6)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(0.9))).thenReturn(0.6216);
        Assertions.assertEquals(1.609, BigDecimal.valueOf(trigonometricFunctionsSpy.getSec(0.9)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(2.42))).thenReturn(-0.75075);
        Assertions.assertEquals(-1.332, BigDecimal.valueOf(trigonometricFunctionsSpy.getSec(2.42)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(3.14))).thenReturn(-1.0);
        Assertions.assertEquals(-1, trigonometricFunctionsSpy.getSec(3.14));

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(4.2))).thenReturn(-0.4903);
        Assertions.assertEquals(-2.040, BigDecimal.valueOf(trigonometricFunctionsSpy.getSec(4.2)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(1.57))).thenReturn(0.0);
        Assertions.assertEquals(Double.NaN, trigonometricFunctionsSpy.getSec(0.0));
    }


    @Test
    public void testTan() {
        TrigonometricFunctions trigonometricFunctionsSpy = Mockito.spy(TrigonometricFunctions.class);

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(Math.PI / 2))).thenReturn(1.0);
        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(Math.PI / 2))).thenReturn(0.0);
        Assertions.assertEquals(Double.NaN, trigonometricFunctionsSpy.getTan(Math.PI / 2));

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(-3.0))).thenReturn(-0.141);
        Mockito.when(trigonometricFunctionsSpy.getCos(Mockito.eq(-3.0))).thenReturn(-0.989);
        Assertions.assertEquals(0.143, BigDecimal.valueOf(trigonometricFunctionsSpy.getTan(-3.0)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

    }

    @Test
    public void testCsc() {
        TrigonometricFunctions trigonometricFunctionsSpy = Mockito.spy(TrigonometricFunctions.class);
        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(-1.47))).thenReturn(-0.995);
        Assertions.assertEquals(-1.005, BigDecimal.valueOf(trigonometricFunctionsSpy.getCsc(-1.47)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(-0.6))).thenReturn(-0.564);
        Assertions.assertEquals(-1.773, BigDecimal.valueOf(trigonometricFunctionsSpy.getCsc(-0.6)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(0.9))).thenReturn(0.783);
        Assertions.assertEquals(1.277, BigDecimal.valueOf(trigonometricFunctionsSpy.getCsc(0.9)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(2.42))).thenReturn(0.660);
        Assertions.assertEquals(1.515, BigDecimal.valueOf(trigonometricFunctionsSpy.getCsc(2.42)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());


        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(4.2))).thenReturn(-0.871);
        Assertions.assertEquals(-1.148, BigDecimal.valueOf(trigonometricFunctionsSpy.getCsc(4.2)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

        Mockito.when(trigonometricFunctionsSpy.getSin(Mockito.eq(Math.PI))).thenReturn(0.0);
        Assertions.assertEquals(Double.NaN, trigonometricFunctionsSpy.getCsc(Math.PI));


    }

    @Test
    public void integrateTestCos() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
        Assertions.assertEquals(0, BigDecimal.valueOf(trigonometricFunctions.getCos(-1.57)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1, trigonometricFunctions.getCos(0.0));
        Assertions.assertEquals(0, BigDecimal.valueOf(trigonometricFunctions.getCos(1.57)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.454, BigDecimal.valueOf(trigonometricFunctions.getCos(-1.1)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.819, BigDecimal.valueOf(trigonometricFunctions.getCos(2.53)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.539, BigDecimal.valueOf(trigonometricFunctions.getCos(2.14)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.946, BigDecimal.valueOf(trigonometricFunctions.getCos(-0.33)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    @Test   //todo done
    public void integrateTestSec() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
        Assertions.assertEquals(-1.181, BigDecimal.valueOf(trigonometricFunctions.getSec(2.58)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-7.644, BigDecimal.valueOf(trigonometricFunctions.getSec(1.702)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(6.486, BigDecimal.valueOf(trigonometricFunctions.getSec(1.416)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.307, BigDecimal.valueOf(trigonometricFunctions.getSec(0.7)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(1.286, BigDecimal.valueOf(trigonometricFunctions.getSec(-0.68)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(10.455, BigDecimal.valueOf(trigonometricFunctions.getSec(-1.475)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-1.382, BigDecimal.valueOf(trigonometricFunctions.getSec(-2.38)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    @Test
    public void integrateTestCot() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
        Assertions.assertEquals(5.9, BigDecimal.valueOf(trigonometricFunctions.getCot(-2.974)).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.858, BigDecimal.valueOf(trigonometricFunctions.getCot(-2.28)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.422, BigDecimal.valueOf(trigonometricFunctions.getCot(-1.97)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(0.0, BigDecimal.valueOf(trigonometricFunctions.getCot(-1.57)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-0.436, BigDecimal.valueOf(trigonometricFunctions.getCot(-1.16)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-4.601, BigDecimal.valueOf(trigonometricFunctions.getCot(-0.214)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-10.495, BigDecimal.valueOf(trigonometricFunctions.getCot(-0.095)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    @Test
    public void integrateTestTan() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
        Assertions.assertEquals(0.121, BigDecimal.valueOf(trigonometricFunctions.getTan(0.12)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-1.424, BigDecimal.valueOf(trigonometricFunctions.getTan(-4.1)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());

    }

    @Test
    public void integrateTestCsc() {
        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
        Assertions.assertEquals(8.353, BigDecimal.valueOf(trigonometricFunctions.getCsc(0.12)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());
        Assertions.assertEquals(-1.038, BigDecimal.valueOf(trigonometricFunctions.getCsc(-1.3)).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue());


    }

}