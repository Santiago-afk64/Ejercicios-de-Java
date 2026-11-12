import java.util.Locale;
import java.util.Scanner;
 
public class Clasificacion {
 
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void clasificacion() {
        System.out.print("Ingrese el promedio del estudiante (0-10): ");
        double promedio = sc.nextDouble();
        System.out.print("Ingrese el porcentaje de asistencia (0-100): ");
        double pAsistencia = sc.nextDouble();
 
        if (promedio >= 9 && pAsistencia >= 90) {
            System.out.println("Estudiante con rendimiento Excelente");
        } else {
            if (promedio >= 7 && pAsistencia >= 80) {
                System.out.println("Estudiante con rendimiento Bueno");
            } else {
                if (promedio >= 6 && pAsistencia >= 70) {
                    System.out.println("Estudiante con rendimiento Regular");
                } else {
                    System.out.println("Estudiante con rendimiento Deficiente");
                }
            }
        }
    }
 
    public static void main(String[] args) {
        clasificacion();
    }
}