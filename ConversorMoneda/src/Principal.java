import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        ConsultarMonedaAPI consulta = new ConsultarMonedaAPI();
        ConsultarMonedaAPI conversion = new ConsultarMonedaAPI();
        Scanner sc = new Scanner(System.in);
        Scanner scAmount = new Scanner(System.in);
        double amount;
        int opcion = 0;
        while (opcion != 7){
            System.out.println("""
                            ******************************
                            Bienvenidx al convertidor de moneda
                            
                            1 - Dolar => Peso Argentino
                            2 - Peso Argentino => Dolar
                            3 - Dolar => Real Brasileño
                            4 - Real Brasileño => Dolar
                            5 - Dolar => Peso Colombiano
                            6 - Peso Colombiano => Dolar
                            7 - Salir
                            Elija una opcion valida:
                            *******************************
                         """);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    Monedas moneda = conversion.buscarMoneda("USD", "ARS", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() +
                            " en " + moneda.target_code()+ "\n");
                    break;

                case 2:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscarMoneda("ARS", "USD", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

                case 3:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscarMoneda("USD", "BRL", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

                case 4:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscarMoneda("BRL", "USD", amount);
                    System.out.println("El valor " + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

                case 5:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscarMoneda("USD", "COP", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

                case 6:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscarMoneda("COP", "USD", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

            }
        }
    }
}
