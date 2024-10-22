import java.util.Scanner;

public class RespiracionPorMinuto {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();

        System.out.println("Ingrese su nivel de actividad: ");
        System.out.println("1) Sedentario");
        System.out.println("2) Moderado");
        System.out.println("3) Activo");
        int nivelActividad = teclado.nextInt();

        System.out.println("_______________________________");
        System.out.println("Ingrese su sexo: ");
        System.out.println("1) Hombre");
        System.out.println("2) Mujer");
        int sexo = teclado.nextInt();

        System.out.println("Ingrese la cantidad de respiraciones por minuto(RPM)");
        int respiraciones = teclado.nextInt();

        if(respiraciones >= 12 && respiraciones <=20){
            System.out.println("La taza de respiración esta en el rango normal");
        }
        else if(respiraciones < 12){
            System.out.println("La taza de respiración esta en el rango bajo");
        }
        else{
            System.out.println("La taza de respiración esta en el rango Alto");
        }
    }
}
