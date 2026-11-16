public class SalarioAnual{
    public static void main(String[] args) {
        double salario = 1500;

        for (int anio = 1; anio <= 6; anio++) {
            salario = salario * 1.1;
            System.out.printf("Salario al finalizar el año %d: %.2f%n", anio, salario);
        }

        System.out.printf("Su salario después de 6 años es: %.2f%n", salario);
    }
}