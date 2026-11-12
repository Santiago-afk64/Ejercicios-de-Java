import java.util.Scanner;

public class SumaHastaCero {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        int n = sm.nextInt();

        while (n != 0) {
            suma += n;
            System.out.print("Ingrese otro número (0 para terminar): ");
            n = sm.nextInt();
        }

        System.out.println("La suma final es: " + suma);
        sm.close();

    }
}