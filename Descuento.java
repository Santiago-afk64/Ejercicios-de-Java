import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese monto total:");
        double monto = sc.nextDouble();
        System.out.println("Es estudiante de la UTPL (V o F):");
        boolean Estudiante = sc.next().toUpperCase().equals("V");

        double descuento = 0;
        if (Estudiante) {
            descuento = 0.20;
            if (monto > 30) {
                descuento += 0.05;
            }
        } else {
            if (monto > 50) {
                descuento = 0.10;
            }
        }
        sc.close();
        double m_final = monto * (1 - descuento);
        System.out.println("Monto final: $" + m_final);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
    }
    
}
