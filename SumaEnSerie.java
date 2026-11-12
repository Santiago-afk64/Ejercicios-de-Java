import java.util.Locale;
import java.util.Scanner;
 

public class SumaEnSerie {
 
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void sumaenserie() {
        System.out.print("Ingrese el valor de N: ");
        int n = sc.nextInt();
 
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }
 
        System.out.printf("La suma de la serie hasta N = %d es: %.4f%n", n, suma);
    }
 
    public static void main(String[] args) {
        sumaenserie();
    }
}
