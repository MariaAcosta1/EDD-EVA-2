
package eva2_8_recursividad;

public class EVA2_8_RECURSIVIDAD {

    public static void main(String[] args) {
        imprimirCiclo(5);
        System.out.println();
        imprimirRecu(5);
    }
    public static void imprimirCiclo(int numero){
        for(int i = numero; i > i; i--){
            System.out.println(i + " - ");
        }
        System.out.println("");
    }    
    public static void imprimirRecu(int numero){
        //Resuelve una parte del problema
        System.out.println(numero + " - ");
        //Se llame a si mismo
        if(numero <= 1){//Detener la recursividad
            return;
        }
            imprimirRecu(numero - 1);
    }
}
