public class ArreglosJava {
    public static void main(String[] args){
        String[] nombres;
        nombres = new String[5];

        nombres[0] = "Javier";
        nombres[1] = "Daniel";
        nombres[2] = "Eduardo";
        nombres[3] = "Maria";
        nombres[4] = "Laura";

        for(int i = 0; i<nombres.length; i++){
            String nombre = nombres[i];
            System.out.println(nombre);
        }

    }
}
