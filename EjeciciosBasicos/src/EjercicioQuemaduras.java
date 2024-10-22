import java.util.Scanner;

public class EjercicioQuemaduras {
    public static void main(String[] args){
        System.out.println("Mostrar información de quemaduras: ");
        System.out.println("Primer grado: ");
        System.out.println("Capa externa de la piel");
        System.out.println("__________________________________");
        System.out.println("Segundo Grado: ");
        System.out.println("Se destruye la epidermis");
        System.out.println("__________________________________");
        System.out.println("Tercer Grado");
        System.out.println("Piel Carbonizada, daño tisular");
        System.out.println("__________________________________");

        System.out.println("Que tipo de quemadura es? ");
        System.out.println("(1) Primer grado");
        System.out.println("(2) Segundo grado");
        System.out.println("(3) Tercer grado");
        System.out.println("Por favor selecciones un numero correspondiente al tipo de quemadura:");

        Scanner teclado = new Scanner(System.in);
        int eleccion = teclado.nextInt();
        if(eleccion == 1) {
            System.out.println("Tratamiento para primer grado");
        }
        else if(eleccion == 2){
            System.out.println("tratamiento para segundo grado");
        }
        else if(eleccion == 3){
            System.out.println("tratamiento para tercer grado");
        }
        else{
            System.out.println("Por favor escoge una opción correctamente!");
        }
    }
}
