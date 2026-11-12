import java.util.Scanner;

public class BaseDecimal {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, cociente, residuo;
        long binario, potencia;

        System.out.println("Ingrese un número decimal entero positivo:");
        numero = sc.nextInt();

        cociente = numero;
        binario = 0;
        potencia = 1;

        if (numero == 0) {
            binario = 0;
        } else {
            while (cociente > 0) {
                residuo = cociente % 2;
                binario = binario + (residuo * potencia);
                cociente = cociente / 2;
                potencia = potencia * 10;
            }
        }

        System.out.println("El numero " + numero + " en binario es: " + binario);

        sc.close();
    }
    
}
