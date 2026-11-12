import java.util.*;

public class PolaresCartesianas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Radio: ");
        double r = sc.nextDouble();
        System.out.print("Ángulo en grados: ");
        double grados = sc.nextDouble();

        double radianes = Math.toRadians(grados);
        double x = r * Math.cos(radianes);
        double y = r * Math.sin(radianes);

        System.out.printf("x = %.4f%n", x);
        System.out.printf("y = %.4f%n", y);
        sc.close();
    }
}