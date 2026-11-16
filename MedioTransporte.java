import java.util.Scanner;

public class MedioTransporte {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Medio de transporte para recorrer 5 km:");
        System.out.println("1. Bus Urbano");
        System.out.println("2. Taxi");
        System.out.println("3. Bicicleta");
        System.out.println("4. Caminar");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opción: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Tiempo estimado: 30 minutos");
                System.out.println("Económico, pero depende de paradas y tráfico");
                break;
            case 2:
                System.out.println("Tiempo estimado: 15 minutos");
                System.out.println("Rápido y cómodo, aunque es la opción más cara");
                break;
            case 3:
                System.out.println("Tiempo estimado: 25 minutos");
                System.out.println("Saludable y gratuito, pero Loja posee mas pendientes");
                break;
            case 4:
                System.out.println("Tiempo estimado: 60 minutos");
                System.out.println("Gratis y saludable, pero toma más tiempo");
                break;
            case 5:
                System.out.println("¡Hasta pronto!");
                break;
            default:
                System.out.println("Opción inválida");
        }
        sc.close();
    }
}
