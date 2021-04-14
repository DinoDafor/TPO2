public class Logarithms {

    //todo понять логику, заменить надписи
    //todo Writer не выводит значения логарифмов на консоль, исправить
    public Double ln(Double x) {
        if (x <= 0.0 || x.isNaN() || x.isInfinite()) {
            return Double.NaN;
        }
        if (x == 1.0) {
            return 0.0;
        }
        double arg = (x-1) / (x+1);
        double sum = 0.0;
        double pow = arg;
        for (int i = 1; i < 100; i += 2) {
            sum += pow / i;
            pow *= arg * arg;
        }
        sum = sum * 2;
        Writer.write(x, sum, "Ln");
        return sum;
    }
    public Double log2(double x) {
        double result = ln(x)/ ln(2.0);
        Writer.write(x, result, "Log_2");
        return result ;
    }
    public Double log3(double x) {
        double result = ln(x)/ ln(3.0);
        Writer.write(x, result, "Log_3");
        return result;
    }
    public Double log5(double x) {
        double result = ln(x)/ ln(5.0);
        Writer.write(x, result, "Log_5");
        return result;
    }







}