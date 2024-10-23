public class GeneradorDeContraseñas {
    public static void main(String[] args) {
        String caracteres ="abcdefghi0123456789";
        String password = "";
        int cantindadCaracteres = 10;
        int contador = 0;
        while(contador < cantindadCaracteres){
            contador++;
            double aleatorio = Math.random();
            aleatorio = Math.floor(aleatorio * 10);
            int numero = (int) aleatorio;

            password += caracteres.charAt(numero);

            //password += numero;
            //System.out.println(numero);
        }
        System.out.println(password);

    }
}
