import com.dante.conversor.modelos.ConsultaApi;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner consulta=new Scanner(System.in);
        String entrada="";
        String salida="";
        System.out.println(""" 
                damos bienvenida al conversor de moneda
                ***********************************************
        Seleecione la moneda que desea cambiar
        1- Dólar =>> Peso argentino
        2- Peso argentino =>> Dólar
        3- Dólar =>> Real brasileñ0
        4- Real brasileño =>> Dólar
        5- Dólar =>> Peso colombiano
        6- Peso colombiano =>> Dólar
        7- Dólar =>> Peso chileno
        8- Peso Chileno =>> Dólar
        9- Salir.
        """);
        int dato=consulta.nextInt();

        switch (dato){
            case 1:
                entrada = "USD";
                salida = "ARS";
                break;
            case 2:
                entrada = "ARS";
                salida = "USD";
                break;
            case 3:
                entrada = "USD";
                salida = "BRL";
                break;
            case 4:
                entrada = "BRL";
                salida = "USD";
                break;
            case 5:
                entrada = "USD";
                salida = "COP";
                break;
            case 6:
                entrada = "COP";
                salida = "USD";
                break;
            case 7:
                entrada = "USD";
                salida = "CLP";
                break;
            case 8:
                entrada = "CLP";
                salida = "USD";
                break;
            case 9:
                System.out.println("Gracias por usar el conversor, ");
                break;

            default:
                System.out.println("El numero ingresado no es valido,  intente nuevamente");
                break;
        }
        System.out.println("digite la cantidad a cambiar");
        double valor= consulta.nextDouble();
        ConsultaApi consulta2=new ConsultaApi();
        double resultado=consulta2.ConexionApi(entrada,salida,valor);
        System.out.println(resultado);

    }
}
