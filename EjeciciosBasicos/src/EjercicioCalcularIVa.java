import java.util.Scanner;

public class EjercicioCalcularIVa {
    public static void main(String[] args){
        System.out.println("Ingrese el total a calcular el IVA: ");
        Scanner teclado = new Scanner(System.in);
        float iva = 21;
        float precio = teclado.nextFloat();
        float totalADescontar = iva * precio / 100;
        float precioFinal = precio - totalADescontar;
        System.out.println("Precio Final: " + precioFinal);
    }
}
