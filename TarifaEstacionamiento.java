import java.util.Locale;
import java.util.Scanner;

public class TarifaEstacionamiento {

    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void tarifaestacionamiento() {
        double tarifaHora = 1.50;
        System.out.print("Ingrese las horas de estacionamiento: ");
        double horas = sc.nextDouble();
        System.out.print("¿Es horario nocturno? (S/N): ");
        String nocturno = sc.next().trim().toUpperCase();
 
        double total = horas * tarifaHora;
 
        if (horas > 8) {
            total = total * 1.25;
        }
 
        if (nocturno.equals("S")) {
            total = total * 1.30;
        }
 
        System.out.printf("Total a pagar: $%.2f%n", total);
    }
 
    public static void main(String[] args) {
        tarifaestacionamiento();
    }
}
