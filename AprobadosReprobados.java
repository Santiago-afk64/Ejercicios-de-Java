import java.util.Scanner;

public class AprobadosReprobados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantEstudiantes = sc.nextInt();

        int aprobados = 0;
        int reprobados = 0;
        int i = 1;

        while (i <= cantEstudiantes) {
            System.out.print("Ingrese la calificación del estudiante " + i + ": ");
            double nota = sc.nextDouble();

            if (nota >= 7) {
                System.out.println("Aprobado");
                aprobados++;
            } else {
                System.out.println("Reprobado");
                reprobados++;
            }
            i++;
        }

        System.out.println("Total aprobados: " + aprobados);
        System.out.println("Total reprobados: " + reprobados);
        sc.close();
    }
}