import java.io.*;

public class Writer {
    private static FileWriter fileWriter;
    private static BufferedReader reader;

    static {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            fileWriter = new FileWriter(new File("src/main/resources/output.csv"));
        }catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void write(double x, double result, String module) {
        try {
            fileWriter.write(x + "," + result + "," + module + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }

    }

    public static void close() {
        try {
            reader.close();
            fileWriter.close();
        }catch (IOException e) {
            System.out.println("Не удалось закрыть потоки");
        }
    }
}