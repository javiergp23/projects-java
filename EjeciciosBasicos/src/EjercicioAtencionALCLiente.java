import java.util.Scanner;

public class EjercicioAtencionALCLiente {
    public static void main(String[] args){

        int opcionEscogida = 1;

        while(opcionEscogida != 0){
            System.out.println("Elija la opción que quiera");
            System.out.println("1) Contactar con soporte técnico");
            System.out.println("2) Contactar con compras");
            System.out.println("3) Contactar con Marketing");
            System.out.println("4) Contactar con Prensa");
            System.out.println("5) Contactar con Legal");
            System.out.println("0) Salir");

            Scanner teclado = new Scanner(System.in);
            opcionEscogida = teclado.nextInt();

            if(opcionEscogida == 1){
                System.out.println("Llamando a soporte tecnico...");
            }
            else if(opcionEscogida == 2){
                System.out.println("Llamando a  compras...");
            }
            else if(opcionEscogida == 3){
                System.out.println("Llamando a marketing...");
            }
            else if(opcionEscogida == 4){
                System.out.println("Llamando a prensa...");
            }
            else if(opcionEscogida == 5){
                System.out.println("Llamando a legal...");
            }
            else{
                System.out.println("Saliendo de la llamada...");
            }
        }
    }
}
