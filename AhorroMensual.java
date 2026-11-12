import java.util.Locale;
import java.util.Scanner;

public class AhorroMensual {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void ahorromensual() {
        System.out.print("Ingrese el capital inicial: ");
        double capital = sc.nextDouble();
        System.out.print("Ingrese el depósito mensual: ");
        double deposito = sc.nextDouble();
        System.out.print("Ingrese el número de meses (N): ");
        int n = sc.nextInt();
        System.out.print("Ingrese la tasa mensual en % (ej. 1.5): ");
        double tasa = sc.nextDouble();
 
        double saldo = capital;
 
        for (int mes = 1; mes <= n; mes++) {
            saldo = saldo + deposito;
            double interes = saldo * tasa / 100;
            saldo = saldo + interes;
            System.out.printf("Mes %d: saldo = $%.2f%n", mes, saldo);
        }
    }
 
    public static void main(String[] args) {
        ahorromensual();
    }
}
