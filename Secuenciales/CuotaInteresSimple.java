import java.util.*;

public class CuotaInteresSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Capital: ");
        double capital = sc.nextDouble();
        System.out.print("Tasa anual (decimal): ");
        double tasa = sc.nextDouble();
        System.out.print("Plazo en meses: ");
        int meses = sc.nextInt();

        double interes = capital * tasa * (meses / 12.0);
        double cuota = (capital + interes) / meses;

        System.out.printf("Interés total: %.2f%n", interes);
        System.out.printf("Cuota mensual: %.2f%n", cuota);
        sc.close();
    }
}