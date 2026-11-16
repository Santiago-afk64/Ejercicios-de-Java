import java.util.Scanner;

public class ClasificaciónTriangulo {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angulo1, angulo2, angulo3, suma;

        System.out.println("Ingrese el angulo 1 del triangulo:");
        angulo1 = sc.nextDouble();
        System.out.println("Ingrese el angulo 2 del triangulo:");
        angulo2 = sc.nextDouble();
        System.out.println("Ingrese el angulo 3 del triangulo:");
        angulo3 = sc.nextDouble();

        suma = angulo1 + angulo2 + angulo3;

        if (suma == 180 && angulo1 > 0 && angulo2 > 0 && angulo3 > 0) {
            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
                System.out.println("Triangulo rectangulo");
            } else {
                if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
                    System.out.println("Triangulo obtusángulo");
                } else {
                    System.out.println("Triangulo acutángulo");
                }
            }
        } else {
            System.out.println("Error: los angulos no forman un triangulo valido");
        }

        sc.close();
    }
}
