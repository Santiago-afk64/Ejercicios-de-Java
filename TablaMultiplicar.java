import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número para multiplicar: ");
        int k = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            int multiplicacion = k * i;
            System.out.println(k + " x " + i + " = " + multiplicacion);
            i++;
        }
        
        sc.close();
    }
}