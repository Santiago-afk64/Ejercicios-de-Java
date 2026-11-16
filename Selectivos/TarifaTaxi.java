import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double km, valBase, total;
        String noche;

        System.out.println("Ingrese cantidad de kilometros:");
        km = sc.nextDouble();
        System.out.println("Ingrese la tarifa base:");
        valBase = sc.nextDouble();
        System.out.println("Es de noche (S/N):");
        noche = sc.next();

        total = valBase + 1.50 * km;

        if (km > 10) {
            total = total + total * 0.20;
        }

        if (noche.equalsIgnoreCase("S")) {
            total = total + total * 0.30;
        }

        System.out.println("El total a pagar es: $" + total);

        sc.close();
    }
}
