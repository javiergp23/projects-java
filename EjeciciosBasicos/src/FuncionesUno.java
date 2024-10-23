public class FuncionesUno {
    public static void main(String[] args){
        double area1 = calcularAreaTriangula(10, 5);
        double area2 = calcularAreaTriangula(10, 5);
        double sumatoriaAreas = area1 + area2;
        System.out.println("La sumatoria de area: " + sumatoriaAreas);

    }

    public static double calcularAreaTriangula(double base, double altura){
        double area = base * altura / 2;
        System.out.println("El area es: " + area);
        return area;
    }
}
