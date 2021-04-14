
public class Main {

    public static void main(String[] args) {
        MathSystems systems = new MathSystems();
        double x = -3.603;
        for (double i = 0; i < 3; i += 1) {

            systems.getResult(x);
            x = x - 6.283;
        }

        Writer.close();


    }
}
