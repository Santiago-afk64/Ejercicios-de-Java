import java.util.Scanner;

public class AccesoLaboratorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Es estudiante de la UTPL? (V o F)");
        boolean estudiante = sc.nextLine().equalsIgnoreCase("V");

        if (estudiante) {
            System.out.println("¿Tiene el carné vigente? (V o F):");
            boolean carnet = sc.nextLine().equalsIgnoreCase("V");
            if (carnet) {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado: carné no vigente.");
            }
        } else {
            System.out.println("¿Tiene autorización del docente? (V o F):");
            boolean autorización = sc.nextLine().equalsIgnoreCase("V");
            if (autorización) {
                System.out.println("Ingreso Temporal");
            } else {
                System.out.println("Acceso denegado");
            }
        }
        sc.close();
    }
    
}
