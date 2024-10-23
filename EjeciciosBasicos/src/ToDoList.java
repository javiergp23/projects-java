import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();
        lista.add("Armar una lista en JAva");
        lista.add("Commitear la app");
        lista.add("Continuar el curso");

        int opcionElegida = 1;
        while(opcionElegida != 0) {
            System.out.println("Que desea hacer");
            System.out.println("1) Agregar una tarea");
            System.out.println("2) Completar una tarea");
            System.out.println("3) Mostrar tareas");

            System.out.println("0) Salir");
            Scanner teclado = new Scanner(System.in);
            opcionElegida = teclado.nextInt();

            switch(opcionElegida) {
                case 1:
                    agregarTarea(lista);
                    break;

                case 2:
                    completarTarea(lista);
                case 3:
                    mostrarTareas(lista);
                case 0:
                    break;

            }
            //completarTarea(lista);
        }
    }

    private static void agregarTarea(List<String> lista) {
        System.out.println("Que tarea deseas agregar?:");
        Scanner teclado = new Scanner(System.in);
        String tarea = teclado.nextLine();
        lista.add(tarea);
    }

    private static void completarTarea(List<String> lista) {
        System.out.println("Que tarea ya completaste?:");
        Scanner teclado = new Scanner(System.in);
        int nroTarea = teclado.nextInt();
        lista.remove(nroTarea - 1);
    }

    private static void mostrarTareas(List<String> lista) {
        int contador = 0;
        for (String tarea : lista) {
            contador++;
            System.out.println(contador + ")  " + tarea);
        }
    }
}
