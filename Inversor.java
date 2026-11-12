import java.util.Locale;
import java.util.Scanner;

public class Inversor {

    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void inversor() {
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();
 
        if (numero > 0) {
            int copia = numero;
            int invertido = 0;
 
            while (copia > 0) {
                int digito = copia % 10;
                invertido = invertido * 10 + digito;
                copia = copia / 10;
            }
 
            System.out.println("Número invertido: " + invertido);
        } else {
            System.out.println("Debe ingresar un número entero positivo");
        }
    }
 
    public static void main(String[] args) {
        inversor();
    }
}
