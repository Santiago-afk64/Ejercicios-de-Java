import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Conversor--");

        System.out.println("1. Kilómetros a metros");

        System.out.println("2. Metros a centrímetros");

        System.out.println("3. Horas a minutos");

        System.out.println("4. Salir");

        System.out.println("Ingrese una opción: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ingrese los kilómetros:");
                double valor = sc.nextDouble();
                double resultado = valor * 1000;
                System.out.println(valor + " km = " + resultado + " m");
                break;
            case 2:
                System.out.println("Ingrese los metros:");
                valor = sc.nextDouble();
                resultado = valor * 100;
                System.out.println(valor + " m = " + resultado + " cm");
                break;
            case 3:
                System.out.println("Ingrese las horas:");
                valor = sc.nextDouble();
                resultado = valor * 60;
                System.out.println(valor + " h = " + resultado + " min");
                break;
            case 4:
                System.out.println("¡Hasta pronto!");
                break;
            default:
                System.out.println("Opción inválida");
                
            }
            sc.close();
    }
}
