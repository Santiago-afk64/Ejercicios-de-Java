import java.util.Scanner;

public class CalculoEnergía {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double potencia, tarifa, consumoMensual, costoTotal;
        int horasDiarias;

        System.out.println("Ingrese la potencia:");
        potencia = sc.nextDouble();
        System.out.println("Ingrese la tarifa:");
        tarifa = sc.nextDouble();
        System.out.println("Ingrese las horas diarias:");
        horasDiarias = sc.nextInt();

        consumoMensual = (potencia / 1000) * horasDiarias * 30;
        costoTotal = consumoMensual * tarifa;

        System.out.println("El consumo mensual es: " + consumoMensual);
        System.out.println("El costo total es: " + costoTotal);

        sc.close();
    }
}