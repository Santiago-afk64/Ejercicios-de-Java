import java.util.Scanner;

public class NumeroPerfecto {

    static Scanner sc = new Scanner(System.in);
 
    static void numeroperfecto() {
        System.out.print("Ingrese un número entero positivo (N): ");
        int n = sc.nextInt();
 
        if (n <= 0) {
            System.out.println("Error: N debe ser positivo");
        } else {
            int suma = 0;
 
            for (int i = 1; i <= n - 1; i++) {
                if (n % i == 0) {
                    suma += i;
                }
            }
 
            if (suma == n) {
                System.out.println(n + " es un número perfecto");
            } else {
                System.out.println(n + " no es un número perfecto");
            }
        }
    }
 
    public static void main(String[] args) {
        numeroperfecto();
    }    
}
