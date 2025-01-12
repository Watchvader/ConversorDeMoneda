import java.util.Scanner;

public class TransformarValor {
    public static void convertir(String monedaBase, String monedaTarget,ConseguirValor consulta, Scanner lectura) {
        try {
            ValorMoneda monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
            System.out.println("La tasa de conversión para hoy\n1 " + monedaBase
                    + " = " + monedas.conversion_rate() + " " + monedaTarget);
            System.out.print("Ingrese la cantidad de " + monedaBase + ": ");
            double cantidad = Double.parseDouble(lectura.nextLine());
            double cantidadConvertida = cantidad * monedas.conversion_rate();
            System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida
                    + " " + monedas.target_code());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido para la cantidad.");
        } catch (RuntimeException e) {
            System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
        }
    }

    public static void convertirOtraMoneda(ConseguirValor consulta, Scanner lectura) {
        System.out.print("Ingrese el código de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.print("Ingrese el código de la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
