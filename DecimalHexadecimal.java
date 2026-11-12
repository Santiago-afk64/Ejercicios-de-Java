import java.util.Scanner;

public class DecimalHexadecimal {
        static Scanner sc = new Scanner(System.in);
 
    static void decimalhexadecimal() {
        System.out.print("Ingrese un número decimal entero positivo: ");
        int numero = sc.nextInt();
 
        if (numero < 0) {
            System.out.println("Error: el número debe ser positivo");
        } else {
            String hexa;
 
            if (numero == 0) {
                hexa = "0";
            } else {
                hexa = "";
                int cociente = numero;
 
                while (cociente > 0) {
                    int residuo = cociente % 16;
                    String digito;
 
                    if (residuo < 10) {
                        digito = String.valueOf(residuo);
                    } else if (residuo == 10) {
                        digito = "A";
                    } else if (residuo == 11) {
                        digito = "B";
                    } else if (residuo == 12) {
                        digito = "C";
                    } else if (residuo == 13) {
                        digito = "D";
                    } else if (residuo == 14) {
                        digito = "E";
                    } else {
                        digito = "F";
                    }
 
                    hexa = digito + hexa;
                    cociente = cociente / 16;
                }
            }
 
            System.out.println(numero + " en hexadecimal es: " + hexa);
        }
    }
 
    public static void main(String[] args) {
        decimalhexadecimal();
    }
}
