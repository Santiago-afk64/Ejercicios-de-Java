import java.util.Locale;
import java.util.Scanner;

public class EstadisticasNotas {
   static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
 
    static void estadisticasnotas() {
        System.out.print("Ingrese la cantidad de calificaciones (N): ");
        int n = sc.nextInt();
 
        if (n <= 0) {
            System.out.println("Error: N debe ser mayor que 0");
        } else {
            double suma = 0;
            int aprobados = 0;
            int reprobados = 0;
            double mayor = 0;
            double menor = 0;
 
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                double nota = sc.nextDouble();
 
                suma += nota;
 
                if (i == 1) {
                    mayor = nota;
                    menor = nota;
                } else {
                    if (nota > mayor) {
                        mayor = nota;
                    }
                    if (nota < menor) {
                        menor = nota;
                    }
                }
 
                if (nota >= 7) {
                    aprobados++;
                } else {
                    reprobados++;
                }
            }
 
            double promedio = suma / n;
 
            System.out.println("RESUMEN");
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.println("Nota mayor: " + mayor);
            System.out.println("Nota menor: " + menor);
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Reprobados: " + reprobados);
        }
    }
 
    public static void main(String[] args) {
        estadisticasnotas();
    }
}