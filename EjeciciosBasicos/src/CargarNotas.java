import java.util.Scanner;

public class CargarNotas {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos:");
        int cantidadAlumnos = teclado.nextInt();

        String[] alumnos = new String[cantidadAlumnos];
        Float[] promedios = new Float[cantidadAlumnos];

        for(int i = 0; i < cantidadAlumnos; i++){

            teclado.nextLine();
            System.out.println("Ingrese le nombre del alumno: ");
            String nombreAlumno = teclado.nextLine();
            alumnos[i] = nombreAlumno;

            System.out.println("Ingrese la nota del 1er semestre:");
            float nota1 = teclado.nextFloat();

            System.out.println("Ingrese la nota del 2do semestre:");
            float nota2 = teclado.nextFloat();

            float promedio = (nota1 + nota2) / 2;
            promedios[i] = promedio;


        }
        for(int i = 0; i < cantidadAlumnos; i++){
            String alumno = alumnos[i];
            Float promedio = promedios[i];
            System.out.println(alumno + " Promedio: " + promedio);

        }

    }
}
