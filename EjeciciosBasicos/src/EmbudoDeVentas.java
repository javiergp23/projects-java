public class EmbudoDeVentas {
    public static void main(String[] args){
        int prospectos = 10000;
        int precioDelServicio = 10;
        System.out.println("Hay "+ prospectos +" prospectos");


        prospectos = filtrarProspectos("se le envia un mail", prospectos, 25);
        prospectos = filtrarProspectos("El prospecto ingresa a la web", prospectos, 10);
        prospectos = filtrarProspectos("El prospecto ingresa a la sección compras", prospectos, 5);
        prospectos = filtrarProspectos("El prospecto compra el servivio", prospectos, 10);

        int precioFinal = prospectos * precioDelServicio;
        System.out.println("Las ganascias totales fueron: " + precioFinal);
    }

    private static int filtrarProspectos(String etapa, int prospectos, int porcentaje) {
        prospectos = porcentaje * prospectos / 100;
        System.out.println("Etapa: "+etapa);
        System.out.println("Prospectos restantes: "+ prospectos );
        return prospectos;
    }
}
