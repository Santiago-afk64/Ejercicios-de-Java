import java.util.Scanner;

public class CostoViajes {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distancia, consumo, precioCombustible;
        int numPeajes;
        double costoPeaje, litros, costoCombustible, costoPeajes, costoTotal;

        System.out.println("Ingrese la distancia del viaje (km): ");
        distancia = sc.nextDouble();
        System.out.println("Ingrese el consumo del auto (km/l): ");
        consumo = sc.nextDouble();
        System.out.println("Ingrese el precio del combustible por litro: ");
        precioCombustible = sc.nextDouble();
        System.out.println("Ingrese el número de peajes: ");
        numPeajes = sc.nextInt();
        System.out.println("Ingrese el costo unitario de cada peaje: ");
        costoPeaje = sc.nextDouble();

        litros = distancia / consumo;
        costoCombustible = litros * precioCombustible;
        costoPeajes = numPeajes * costoPeaje;
        costoTotal = costoCombustible + costoPeajes;

        System.out.println("Litros necesarios: " + litros);
        System.out.println("Costo del combustible: " + costoCombustible);
        System.out.println("Costo de peajes: " + costoPeajes);
        System.out.println("Costo Total del viaje: " + costoTotal);

        sc.close();
    }
    
}
