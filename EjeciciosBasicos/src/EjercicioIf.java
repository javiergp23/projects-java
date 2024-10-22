import java.util.Scanner;

public class EjercicioIf {
    public static void main(String[] args){
        System.out.println("Ingrese su edad: ");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        if(edad >= 18){
            System.out.println("El usuario puede ingresar el sitio");
        }
        else{
            System.out.println("Usuario NO puede ingresar es menor de edad");
        }
    }
}
