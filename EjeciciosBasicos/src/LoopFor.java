public class LoopFor {
    public static void main(String[] args){
        /*for(int i=1;i<=100;i++){
            System.out.println(i);
        }*/
        /*for(int i=1;i<100;i++){
            boolean esPar = (i % 2 == 0);
            if (esPar){
                System.out.println(i);
            }
        }
        for(int i=1;i<100;i++){
            boolean esImpar = (i % 3 == 0);
            if (esImpar){
                System.out.println(i);
            }
        }
*/
        //otra forma de hacerlo
        for(int i=1; i<=100; i++) {
            double divisor = 2;
            double num1 = i / divisor;
            double num2 = Math.floor(i/2);
            if(num1 == num2){
                System.out.println(i);
            }
        }
    }
}
