import java.util.Locale;
import java.util.Scanner;

public class Armstrong {
 
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void armstrong() {
        System.out.print("Ingrese un número de tres dígitos: ");
        int numero = sc.nextInt();
 
        if (numero >= 100 && numero <= 999) {
            int copia = numero;
            int suma = 0;
 
            while (copia > 0) {
                int digito = copia % 10;
                suma += digito * digito * digito;
                copia = copia / 10;
            }
 
            if (suma == numero) {
                System.out.println(numero + " es un número de Armstrong");
            } else {
                System.out.println(numero + " no es un número de Armstrong");
            }
        } else {
            System.out.println("El número debe tener exactamente tres dígitos");
        }
    }
 
    public static void main(String[] args) {
        armstrong();
    }
}
