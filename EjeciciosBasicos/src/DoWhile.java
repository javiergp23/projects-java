import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){

            int intentos = 3;
            while(intentos > 0){

            String password = "chocolate";
            System.out.println("Ingrese una contraseña");
            Scanner teclado = new Scanner(System.in);
            String userPassword = teclado.nextLine();

            if(password.equals(userPassword)){
                System.out.println("Inicio sesion correctamente");
                break;
            } else{
                System.out.println("Password incorrecto");
                intentos--;
                if(intentos == 0){
                    System.out.println("Cuenta bloqueada por reiterados intentos");
                }else {
                    System.out.println("Le quedan: "+ intentos + " intentos" );
                }
            }
        }
    }
}
