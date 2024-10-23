public class PooEjercicio {
    public static void main(String[] args){

        //Forma 1
        String[] nombres = new String[]{"Lucas", "karen", "Aldo", "Gisela"};
        String[] telefonos = new String[]{"1232126", "15624594", "549876544", "3232164525"};

        //Forma 2
        PooEjercicioUno persona1 = new PooEjercicioUno();
        persona1.nombre = "Lucas";
        persona1.telefono = "1232126";
        persona1.mostrarDatos();

    }
}
