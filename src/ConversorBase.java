public class ConversorBase {

    public static int baseToDecimal (String numberStr, int base){
        return Integer.parseInt(numberStr, base);
    }

    public static String decimalToBase(int number, int radix) {
        return Integer.toString(number, radix).toUpperCase(); // Convertir a mayúsculas para estandarización
    }
}