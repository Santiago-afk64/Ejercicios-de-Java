import java.util.Scanner;

public class MCD {

    static Scanner sc = new Scanner(System.in);
 
    static void mcd() {
        System.out.print("Ingrese el primer número (positivo): ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número (positivo): ");
        int num2 = sc.nextInt();
 
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Error: los números deben ser positivos");
        } else {
            int a = num1;
            int b = num2;
 
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
 
            System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + a);
        }
    }
 
    public static void main(String[] args) {
        mcd();
    }    
}
