import java.util.Scanner;

public class TemperaturaLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura (En grados Celsius):");
        double temperatura = sc.nextDouble();

        if (temperatura < 15) {
            System.out.println("Temperatura: Fría");
        } else if (temperatura <= 25) {
            System.out.println("Temperatura: Templado");
        } else {
            System.out.println("Temperatura: Calido");
            if (temperatura > 30) {
                System.out.println("Calor extermo");
            }
        }
        sc.close();

    }
    
}
