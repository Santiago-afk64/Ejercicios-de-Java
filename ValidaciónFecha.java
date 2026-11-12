import java.util.Scanner;

public class ValidaciónFecha {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anio, diasMes = 0;
        boolean bisiesto, valida;

        System.out.println("Ingrese el día:");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes:");
        mes = sc.nextInt();
        System.out.println("Ingrese el año:");
        anio = sc.nextInt();

        bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        valida = false;

        if (mes >= 1 && mes <= 12 && anio > 0) {
            if (mes == 2) {
                if (bisiesto) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
            } else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    diasMes = 30;
                } else {
                    diasMes = 31;
                }
            }

            if (dia >= 1 && dia <= diasMes) {
                valida = true;
            }
        }

        if (valida) {
            System.out.println("La fecha es válida");
        } else {
            System.out.println("La fecha no es válida");
        }

        sc.close();
    }
}
