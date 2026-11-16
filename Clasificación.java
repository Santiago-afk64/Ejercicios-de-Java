import java.util.Scanner;

public class Clasificación {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;

        System.out.println("Ingrese la letra de clasisficación (A, B, C, D, F): ");
        letra = sc.nextLine().toUpperCase();
        

        switch (letra) {
            case "A":
                System.out.println("Rango 9-10");
                break;
            case "B":
                System.out.println("Rango 8-8.9");
                break;
            case "C":
                System.out.println("Rango 7-7.9");
                break;
            case "D":
                System.out.println("Rango 6-6.9");
                break;
            case "F":
                System.out.println("Rango 0-5.9");
                break;
            default:
                System.out.println("Letra de clasificación inválida");
        }
        sc.close();
    }
}