import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите значение d (Давление): ");
        double d = scanner.nextDouble(); // давление (1.7)
        double g = 9.8; // 9.8 m/s^2 ускорение свободного падения
        System.out.println("Введите значение h (Высота): ");
        double h = scanner.nextDouble(); // высота (5.5)
        double p = d * g * h; // плотность
        System.out.println("Плотность равна: ");
        System.out.println(p); // (91.63)

    }
}
