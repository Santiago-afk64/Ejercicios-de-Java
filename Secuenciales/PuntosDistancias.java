import java.util.Scanner;

public class PuntosDistancias {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, distancia, puntoMedioX, puntoMedioY;

        System.out.println("Ingrese valor x1:");
        x1 = sc.nextDouble();
        System.out.println("Ingrese valor y1:");
        y1 = sc.nextDouble();
        System.out.println("Ingrese valor x2:");
        x2 = sc.nextDouble();
        System.out.println("Ingrese valor y2:");
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        puntoMedioX = (x1 + x2) / 2;
        puntoMedioY = (y1 + y2) / 2;

        System.out.println("La distancia de los dos puntos es: " + distancia);
        System.out.println("Las coordenadas del punto medio son: (" + puntoMedioX + ", " + puntoMedioY + ")");

        sc.close();
    }
    
}
