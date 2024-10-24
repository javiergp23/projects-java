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
        if(respuestaDelUsuario.equals(respuestaDeLaComputadora)){
            System.out.println("EMPATE!");
        }else if(respuestaDelUsuario.equals("Piedra") && respuestaDeLaComputadora.equals("Tijera")){
            System.out.println("Ganaste");
        }else if(respuestaDelUsuario.equals("Tijera") && respuestaDeLaComputadora.equals("Papel")){
            System.out.println("Ganaste");
        }else if(respuestaDelUsuario.equals("Papel") && respuestaDeLaComputadora.equals("Piedra")){
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
