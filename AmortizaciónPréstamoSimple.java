import java.util.Scanner;

public class AmortizaciónPréstamoSimple {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double montoPrestamos, tasaMensual, interesTotal, cuotaMensual;
        int nMeses;

        System.out.println("Ingrese el monto de prestamos:");
        montoPrestamos = sc.nextDouble();
        System.out.println("Ingrese la tasa mensual:");
        tasaMensual = sc.nextDouble();
        System.out.println("Ingrese el numero de meses:");
        nMeses = sc.nextInt();

        interesTotal = montoPrestamos * tasaMensual * nMeses;
        cuotaMensual = (montoPrestamos + interesTotal) / nMeses;

        System.out.println("El interes total es: " + interesTotal);
        System.out.println("La cuota a pagar es: " + cuotaMensual);

        sc.close();
    }
} 