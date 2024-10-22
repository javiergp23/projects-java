public class GeneradorDeContraseñas {
    public static void main(String[] args) {
        String caracteres ="0123456789";
        String password = "";
        int cantindadCaracteres = 10;

        double aleatorio = Math.random();
        aleatorio = Math.floor(aleatorio * 10);
        int numero = (int) aleatorio;
        password += aleatorio;
        System.out.println(aleatorio);
    }
}
