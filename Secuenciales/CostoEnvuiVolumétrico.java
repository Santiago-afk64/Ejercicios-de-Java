import java.util.*;

public class CostoEnvuiVolumétrico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Peso real (kg): ");
        double pesoReal = sc.nextDouble();
        System.out.print("Largo (cm): ");
        double largo = sc.nextDouble();
        System.out.print("Ancho (cm): ");
        double ancho = sc.nextDouble();
        System.out.print("Alto (cm): ");
        double alto = sc.nextDouble();

        double pesoVol = (largo * ancho * alto) / 5000;
        double pesoCobrar = Math.max(pesoReal, pesoVol);
        double costo = pesoCobrar * 2.50;

        System.out.printf("Peso volumétrico: %.2f kg%n", pesoVol);
        System.out.printf("Peso a cobrar: %.2f kg%n", pesoCobrar);
        System.out.printf("Costo total: $%.2f%n", costo);
        sc.close();
    }
}