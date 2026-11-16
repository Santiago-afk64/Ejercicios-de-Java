import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        String nombre, tipo;

        System.out.println("Ingrese un número del 1 al 7");
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                nombre = "Lunes";
                tipo = "Día de clases";
                break;
            case 2:
                nombre = "Martes";
                tipo = "Día de clases";
                break;
            case 3:
                nombre = "Miércoles";
                tipo = "Día de clases";
                break;
            case 4:
                nombre = "Jueves";
                tipo = "Día de clases";
                break;
            case 5:
                nombre = "Viernes";
                tipo = "Día de clases";
                break;
            case 6:
                nombre = "Sábado";
                tipo = "Fin de semana";
                break;
            case 7:
                nombre = "Domingo";
                tipo = "Fin de semana";
                break;
            default:
                nombre = "Inválido";
                tipo = "Número fuera de rango (1 a 7)";
        }

        System.out.println("Día: " + nombre);
        System.out.println("Tipo: " + tipo);
        sc.close();
    }
}
