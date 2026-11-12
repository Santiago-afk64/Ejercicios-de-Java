import java.util.Locale;
import java.util.Scanner;

public class DocumentoYFrecuencia {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void documentoyfrecuencia() {
        System.out.print("Ingrese el monto de la compra: ");
        double monto = sc.nextDouble();
        System.out.print("¿Es cliente frecuente? (S/N): ");
        String frecuente = sc.next().trim().toUpperCase();
 
        double porcentaje;
        if (monto >= 500) {
            porcentaje = 15;
        } else {
            if (monto >= 300) {
                porcentaje = 10;
            } else {
                if (monto >= 100) {
                    porcentaje = 5;
                } else {
                    porcentaje = 0;
                }
            }
        }
 
        if (frecuente.equals("S")) {
            porcentaje += 5;
        }
 
        double descuento = monto * porcentaje / 100;
        double total = monto - descuento;
 
        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.printf("Total a pagar: $%.2f%n", total);
    }
 
    public static void main(String[] args) {
        documentoyfrecuencia();
    }
}
