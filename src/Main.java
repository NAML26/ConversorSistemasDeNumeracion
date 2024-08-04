import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 1;

        while (opcion == 1) {
            // Ingresar número a convertir
            System.out.println("Escribe el número que quieres convertir");
            String numberStr = scanner.nextLine(); // String para poder ingresar todos los posibles caracteres

            System.out.println("Ingresa la base en la que está ese número");
            int fromBase = scanner.nextInt();

           scanner.nextLine(); // Consumir el caracter de nueva línea residual

            System.out.println("Número ingresado: " + numberStr + " en base " + fromBase);

            // Ingresar la base a la que quieres convertir
            System.out.println("Escribe la base a la que quieres convertir el número " + numberStr);
            int radix = scanner.nextInt();

            scanner.nextLine(); // Consumir el caracter de nueva línea residual

            try {
                // Convertir número original a decimal
                int decimal = ConversorBase.baseToDecimal(numberStr, fromBase);

                // Convertir número decimal a base deseada
                String conversion = ConversorBase.decimalToBase(decimal, radix);

                System.out.println("El numero " + numberStr + " (en base " + fromBase + ") convertido en base " + radix + " es: " + conversion);
            } catch (NumberFormatException e) {
                System.out.println("Error: La entrada no es válida para la base especificada.");
            }

            // Mostrar opciones para continuar o salir
            System.out.println("Elige una opción:");
            System.out.println("1.- Hacer otra conversión");
            System.out.println("2.- Salir");
            opcion = scanner.nextInt();

            scanner.nextLine(); // Consumir el caracter de nueva línea residual

            // Validar la opción ingresada
            while (opcion != 1 && opcion != 2) {
                System.out.println("Opción no válida. Por favor, elige 1 o 2.");
                opcion = scanner.nextInt();

                scanner.nextLine(); // Consumir el caracter de nueva línea residual
            }
        }

        System.out.println("¡Adiós!");
        scanner.close(); // Cerrar el Scanner al final
    }
}