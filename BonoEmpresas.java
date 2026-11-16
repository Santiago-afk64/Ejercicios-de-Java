import java.util.Scanner;

public class BonoEmpresas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los años de antigüedad");
        double antiguedad = sc.nextDouble();
        System.out.println("Ingrese el sueldo");
        double sueldo = sc.nextDouble();
        System.out.println("¿La evaluación es excelente? (V o F)");
        String respuesta = sc.next().trim().toUpperCase();
        boolean excelente = respuesta.equals("V") || respuesta.equals("VERDADERO");

        double bono = 0;
        if (antiguedad > 2) {
            bono = sueldo * 0.10;
            if (excelente) {
                bono = bono + sueldo * 0.05;
            }
        } else {
            if (excelente) {
                bono = sueldo * 0.05;
            }
        }

        double sueldoTotal = sueldo + bono;
        System.out.println("Bono: $" + bono);
        System.out.println("Sueldo total: $" + sueldoTotal);
        sc.close();
    }
}
