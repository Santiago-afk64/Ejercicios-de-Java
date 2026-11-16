import java.util.*;

public class AreaHipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Cateto 1: ");
        double a = sc.nextDouble();
        System.out.print("Cateto 2: ");
        double b = sc.nextDouble();

        double hipotenusa = Math.sqrt(a * a + b * b);
        double area = (a * b) / 2;

        System.out.printf("Hipotenusa: %.2f%n", hipotenusa);
        System.out.printf("Área: %.2f%n", area);
        sc.close();
    }
}