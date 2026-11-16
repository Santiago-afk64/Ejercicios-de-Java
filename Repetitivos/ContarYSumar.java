import java.util.Locale;
import java.util.Scanner;

public class ContarYSumar {

    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void contarysumar() {
        System.out.print("Ingrese el valor de N: ");
        int n = sc.nextInt();
 
        int contador = 0;
        int suma = 0;
 
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                contador++;
                suma += i;
            }
        }
 
        System.out.println("Cantidad de múltiplos de 3 o 5: " + contador);
        System.out.println("Suma de los múltiplos: " + suma);
    }
 
    public static void main(String[] args) {
        contarysumar();
    }
}
