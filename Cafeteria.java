import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("----Menú----");
        System.out.println("1. Café....$1.50");
        System.out.println("2. Jugo....$1.20");
        System.out.println("3. Sandwich....$2.50");
        System.out.println("4. Salir");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("El precio es: $1.50");
                break;
            case 2:
                System.out.println("El precio es: $1.20");
                break;
            case 3:
                System.out.println("El precio es: $2.50");
                break;
            case 4:
                System.out.println("Hasta luego :D");
                break;
            default:
                System.out.println("Error: opcion no valida");
        }
        sc.close();
    }
}