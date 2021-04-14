import static java.lang.Double.NaN;

public class TrigonometricFunctions {

    public Double getSin(Double x) {

        if (x.isNaN() ||x.isInfinite() ) {
            return NaN;
        }



        //Убираем "лишние" круги
        if (x >= Math.PI) {
            while (x >= Math.PI) {
                x -= 2 * Math.PI;
            }
        } else if (x <= -Math.PI) {
            while (x <= -Math.PI) {
                x += 2 * Math.PI;
            }
        }

        double result = 0;
        double pow = x;
        long fact = 1;
        short sign = 1;

        for (int i = 1; i < 9; i++) {
            result += sign * pow / fact;
            sign *= -1;
            pow *= x * x;
            fact *= (long) (i * 2) * (i * 2 + 1);
        }

        Writer.write(x, result, "Sin");
        return result;
    }


    //Применяется основное тригонометрическое тождество sin^2 (x) + cos^2 (x) = 1;
    public double getCos(double x) {
        double result = Math.sqrt(1 - Math.pow(getSin(x), 2));

        if (Math.round(x / Math.PI) % 2 != 0)
            result = (result == 0 ? 0 : -1 * result);
        Writer.write(x, result, "Cos");
        return result;
    }

    public double getSec(double x) {
        double result;
        if (x % Math.PI / 2 == 0) {
            result = NaN;
            Writer.write(x, result, "Sec");
            return result;
        }
        result = 1 / getCos(x);
        Writer.write(x, result, "Sec");
        return result;
    }

    public double getCot(double x) {
        double result;
        if (x % Math.PI == 0) {
            result = NaN;
            Writer.write(x, result, "Cot");
            return result;
        }
        result = getCos(x) / getSin(x);
        Writer.write(x, result, "Cot");
        return result;
    }


    public double getTan(double x) {
        double result;
        if (x % (Math.PI / 2) == 0) {
            result = NaN;
            Writer.write(x, result, "Tan");
            return result;
        }
        result = getSin(x) / getCos(x);
        Writer.write(x, result, "Tan");
        return result;
    }

    public double getCsc(double x) {
        double result;
        if (x % Math.PI == 0) {
            result = NaN;
            Writer.write(x, result, "Csc");
            return result;
        }
        result = 1 / getSin(x);
        Writer.write(x, result, "Csc");
        return result;
    }




}
