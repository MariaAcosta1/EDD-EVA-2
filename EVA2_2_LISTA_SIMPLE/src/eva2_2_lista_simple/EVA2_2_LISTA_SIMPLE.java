
package eva2_2_lista_simple;

public class EVA2_2_LISTA_SIMPLE {

    public static void main(String[] args) {
        Lista_Simple lista = new Lista_Simple();
        /*int[] arreglo = new int [1000000];
        long ini, fin, tiempo;
        ini = System.nanoTime(); //Tomamos la "hora" antes de empezar
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100);
        }
        fin = System.nanoTime(); 
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);
        
        ini = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            lista.agregar((int)(Math.random() * 100));
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("Tiempo arreglo = " + tiempo);*/
        
        System.out.println("Tamaño de la lista: " + lista.longitud());
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.Imprimir();
        System.out.println("Valor en la posicion 5: " + lista.valorEn(0));
        System.out.println("Tamaño de la lista: " + lista.longitud());
        System.out.println("Valor en la posicion 5: " + lista.EncontrarValor(100));
        System.out.println("Valor en la posicion 5: " + lista.EncontrarValor(200));
        System.out.println("Valor en la posicion 5: " + lista.EncontrarValor(300));
        System.out.println("Valor en la posicion 5: " + lista.EncontrarValor(400));
        lista.InsertarEn(250, 2);
        lista.Imprimir(); 
        lista.BorrarEn(4);
        System.out.println("Lista despues de borrar:");
        lista.Imprimir();
        System.out.println("Tamaño: " + lista.longitud());
        lista.Imprimir();
        lista.Vaciar_lista();
        lista.Imprimir();
        System.out.println("Tamaño de la lista: " + lista.longitud());
    }
    
}
