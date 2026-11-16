import java.util.*;

public class ValorAnualidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Depósito mensual: ");
        double D = sc.nextDouble();
        System.out.print("Tasa mensual (decimal): ");
        double i = sc.nextDouble();
        System.out.print("Número de meses: ");
        int n = sc.nextInt();

        double totalDepositado = D * n;
        double vf = D * ((Math.pow(1 + i, n) - 1) / i);

        System.out.printf("Total depositado: %.2f%n", totalDepositado);
        System.out.printf("Valor futuro: %.2f%n", vf);
        sc.close();
    }
} 