public class MathSystems {

    private Logarithms logarithms;
    private TrigonometricFunctions trigonometricFunctions;

    public MathSystems() {
        this.trigonometricFunctions = new TrigonometricFunctions();
        this.logarithms = new Logarithms();
    }


    public double getResult(double x) {
        double result;
        if (x > 0) {
            double ln = logarithms.ln(x);
            double log_2 = logarithms.log2(x);
            double log_3 = logarithms.log3(x);
            double log_5 = logarithms.log5(x);
            result = ((((Math.pow((log_5 * log_5), 2)) * log_3) * (log_3 / log_2)) / ((ln + (Math.pow(log_2, 3))) * (log_2 * ln)));
        } else {
            double sin = trigonometricFunctions.getSin(x);
            double cos = trigonometricFunctions.getCos(x);
            double tan = trigonometricFunctions.getTan(x);
            double cot = trigonometricFunctions.getCot(x);
            double sec = trigonometricFunctions.getSec(x);
            double csc = trigonometricFunctions.getCsc(x);

            result = ((((((Math.pow((((((((Math.pow((((((csc * csc) - csc) * tan) + cos) - cos), 2)) + sec) + cot) - cos) + ((csc / (cot * tan)) - (Math.pow(csc, 2)))) - (sin + cos))
                    * ((Math.pow(tan, 3)) / (Math.pow((cos + cot), 2)))), 3)) - (((((Math.pow(((Math.pow((csc - (csc + sin)), 2)) - sin), 2)) + ((Math.pow(cos, 3)) - cos)) / cos) / csc) - csc)) + ((((((sin
                    * (Math.pow((csc * (Math.pow(tan, 2))), 3))) * sec) * cot) * ((cot * cos) * tan)) * (tan - tan)) * (((sec * sin) - ((csc / tan) + sin)) * cos)))
                    + csc) * (Math.pow(((Math.pow((csc * tan), 3)) - tan), 2))) - ((sin * (((((sec + (cot / (cot * cos))) + (csc * sin)) * (csc + (cos + cos))) * (Math.pow((cos / tan), 2)))
                    - Math.pow(csc, 3))) / (Math.pow(((csc * cot) + (tan - Math.pow((Math.pow((((sec / cot) / cos) + sin), 3) - cot), 2))), 3) * ((sec * cos) / csc))));
        }
        Writer.write(x, result, "System");
        return result;
    }

}