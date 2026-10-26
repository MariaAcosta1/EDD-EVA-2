
package eva2_11_fibonacci;

public class EVA2_11_FIBONACCI {

    public static void main(String[] args) {
        //Fibonacci con recursividad
        //solo valor en la posicion
        System.out.println("fibonacci(2): " + fibonacci(2));
    }
    public static int fibonacci(int posicion) {
        if (posicion > 1)
            return fibonacci(posicion - 2) + fibonacci(posicion - 1);
        else
            return 1;
    }
}
