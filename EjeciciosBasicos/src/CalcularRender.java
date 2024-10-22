import java.util.Scanner;

public class CalcularRender {
    public static void main(String[] args){
    System.out.println("Indique la cantidad de minutos a renderizar: ");
    Scanner teclado = new Scanner(System.in);
    double cantMinutos = teclado.nextDouble();
    double precioPorMinuto = 0.05;
    double precioFinal = precioPorMinuto * cantMinutos;
    System.out.println("Precio final: $" + precioFinal);
    }
}
