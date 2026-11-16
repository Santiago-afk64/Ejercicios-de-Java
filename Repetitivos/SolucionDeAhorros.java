import java.util.Locale;
import java.util.Scanner;

public class SolucionDeAhorros {

    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void soluciondeahorros() {
        System.out.print("Ingrese el número de meses: ");
        int n = sc.nextInt();
 
        double saldo = 0;
        for (int mes = 1; mes <= n; mes++) {
            System.out.print("Ingrese el aporte del mes " + mes + ": ");
            double aporte = sc.nextDouble();
            saldo += aporte;
            saldo *= 1.008;
        }
 
        System.out.printf("Saldo final después de %d meses: $%.2f%n", n, saldo);
    }
 
    public static void main(String[] args) {
        soluciondeahorros();
    }
}
