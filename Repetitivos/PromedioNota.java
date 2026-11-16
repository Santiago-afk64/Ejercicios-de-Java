import java.util.Scanner;

public class PromedioNota { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("La cantidad de notas debe ser mayor que 0");
            System.out.print("Ingrese la cantidad de notas: ");
            n = sc.nextInt();
        }

        double suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la nota " + i + " (0 a 10): ");
            double nota = sc.nextDouble();
            while (nota < 0 || nota > 10) {
                System.out.println("La nota debe estar entre 0 y 10");
                System.out.print("Ingrese la nota " + i + " (0 a 10): ");
                nota = sc.nextDouble();
            }
            suma += nota;
            sc.close();
        }

        double promedio = suma / n;
        System.out.println("El promedio de las notas es: " + promedio);
    }
}