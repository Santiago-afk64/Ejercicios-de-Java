import java.util.Locale;
import java.util.Scanner;
 
public class DeterminaciónDeCuadrantes {
 
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void determinaciondecuadrante() {
        System.out.print("Ingrese la coordenada x: ");
        double x = sc.nextDouble();
        System.out.print("Ingrese la coordenada y: ");
        double y = sc.nextDouble();
 
        if (x == 0 && y == 0) {
            System.out.println("El punto está en el origen");
        } else {
            if (x == 0) {
                System.out.println("El punto está sobre el eje Y");
            } else {
                if (y == 0) {
                    System.out.println("El punto está sobre el eje X");
                } else {
                    if (x > 0 && y > 0) {
                        System.out.println("Primer cuadrante");
                    } else {
                        if (x < 0 && y > 0) {
                            System.out.println("Segundo cuadrante");
                        } else {
                            if (x < 0 && y < 0) {
                                System.out.println("Tercer cuadrante");
                            } else {
                                System.out.println("Cuarto cuadrante");
                            }
                        }
                    }
                }
            }
        }
    }
 
    public static void main(String[] args) {
        determinaciondecuadrante();
    }
}