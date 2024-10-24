import java.util.Random;
import java.util.Scanner;

public class Jankenpon {
    public void jugar(){
        System.out.println("Juguemos Piedra, Papel o tijeras");
        System.out.println("Escribe alguno de estos:  Piedra, Papel, o tijeras");

        Scanner teclado = new Scanner(System.in);
        String respuestaDelUsuario = teclado.nextLine();

        String respuestaDeLaComputadora = elegirOpcionAleatoria();

        decidirQuienGano(respuestaDelUsuario, respuestaDeLaComputadora);


    }

    private void decidirQuienGano(String respuestaDelUsuario, String respuestaDeLaComputadora) {
        //Empate
        if(respuestaDelUsuario.equalsIgnoreCase(respuestaDeLaComputadora)){
            System.out.println("EMPATE!");
        }else if(respuestaDelUsuario.equalsIgnoreCase("Piedra") && respuestaDeLaComputadora.equalsIgnoreCase("Tijera")){
            System.out.println("Ganaste");
        }else if(respuestaDelUsuario.equalsIgnoreCase("Tijera") && respuestaDeLaComputadora.equalsIgnoreCase("Papel")){
            System.out.println("Ganaste");
        }else if(respuestaDelUsuario.equalsIgnoreCase("Papel") && respuestaDeLaComputadora.equalsIgnoreCase("Piedra")){
            System.out.println("Ganaste");
        }else {
            System.out.println("PERDISTE!");
        }
    }

    private String elegirOpcionAleatoria() {
        String respuestaDeLaComputadora = "";

        Random generarNumerosAleatorios = new Random();
        int numAleatorio = generarNumerosAleatorios.nextInt(3);
        if(numAleatorio == 0){
            respuestaDeLaComputadora = "Piedra";
        }
        if(numAleatorio == 1){
            respuestaDeLaComputadora = "Papel";
        }
        if(numAleatorio == 2){
            respuestaDeLaComputadora = "Tijera";
        }
        System.out.println("La computadora escogió: " + respuestaDeLaComputadora);
        return respuestaDeLaComputadora;
    }

}
