import java.util.Scanner;

public class BonoProductividad {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sueldoBase, productividad, porcentaje, bono, total;

        System.out.println("Ingrese el sueldo base:");
        sueldoBase = sc.nextDouble();
        System.out.println("Ingrese el porcentaje de productividad:");
        productividad = sc.nextDouble();

        if (productividad >= 90) {
            porcentaje = 0.20;
        } else {
            if (productividad >= 70) {
                porcentaje = 0.10;
            } else {
                if (productividad >= 50) {
                    porcentaje = 0.05;
                } else {
                    porcentaje = 0;
                }
            }
        }

        bono = sueldoBase * porcentaje;
        total = sueldoBase + bono;

        System.out.println("Bono: $" + bono);
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }
}
