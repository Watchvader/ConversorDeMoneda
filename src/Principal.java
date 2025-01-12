import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConseguirValor consulta = new ConseguirValor();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("**************************************************\n" +
                    "Bienvenidos al conversor de monedas.\n" +
                    "Ingresa la conversión que deseas realizar\n" +
                    "1. Dólar a Peso Argentino\n" +
                    "2. Peso Argentino a Dólar\n" +
                    "3. Dólar a Real Brasileño\n" +
                    "4. Real Brasileño a Dólar\n" +
                    "5. Dólar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dólar\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir\n" +
                    "**************************************************\n" +
                    "Elige una opción válida:");
            try {
                opcion = Integer.parseInt(lectura.nextLine());
                switch (opcion) {
                    case 1 -> TransformarValor.convertir("USD", "ARS", consulta, lectura);
                    case 2 -> TransformarValor.convertir("ARS", "USD", consulta, lectura);
                    case 3 -> TransformarValor.convertir("USD", "BRL", consulta, lectura);
                    case 4 -> TransformarValor.convertir("BRL", "USD", consulta, lectura);
                    case 5 -> TransformarValor.convertir("USD", "COP", consulta, lectura);
                    case 6 -> TransformarValor.convertir("COP", "USD", consulta, lectura);
                    case 7 -> TransformarValor.convertirOtraMoneda(consulta, lectura);
                    case 8 -> System.out.println("Cerrando el programa...");
                    default -> System.out.println("Opción no válida. Inténtalo nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido.");
            }
        }
        lectura.close(); // Cierra el Scanner al terminar
    }
}
