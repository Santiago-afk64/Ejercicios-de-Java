import java.util.Scanner;

public class TarifaParqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Es estudiante de la UTPL? (V o F)");
        boolean respuesta = sc.next().trim().toUpperCase().equals("V") || sc.next().trim().toUpperCase().equals("VERDADERO");
        boolean estudiante = respuesta;
        System.out.println("Ingrese las horas de permanencia");
        double horas = sc.nextDouble();

        double tarifa = horas * 1.00;
        if (estudiante) {
            tarifa = tarifa * 0.50;
            if (horas > 4) {
                tarifa = tarifa * 1.20;
            }
        } else {
            if (horas > 6) {
                tarifa = tarifa * 1.20;
            }
        }

        System.out.println("Monto a pagar: $" + tarifa);
        sc.close();

    }
    
}
