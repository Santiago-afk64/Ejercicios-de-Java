import java.util.Locale;
import java.util.Scanner;

public class TipoEcuacionCuadratica {
    
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void tipo_ecuacioncuadratica() {
        System.out.print("Ingrese el coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = sc.nextDouble();
 
        if (a == 0) {
            System.out.println("No es una ecuación cuadrática (a no puede ser 0)");
        } else {
            double discriminante = b * b - 4 * a * c;
 
            if (discriminante > 0) {
                System.out.println("Tiene dos soluciones reales distintas");
            } else {
                if (discriminante == 0) {
                    System.out.println("Tiene una solución real (doble)");
                } else {
                    System.out.println("No tiene soluciones reales");
                }
            }
        }
    }
 
    public static void main(String[] args) {
        tipo_ecuacioncuadratica();
    }
}
