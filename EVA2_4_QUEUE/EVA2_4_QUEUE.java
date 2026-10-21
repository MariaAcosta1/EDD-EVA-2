
package eva2_4_queue;

public class EVA2_4_QUEUE {

    public static void main(String[] args) {
        MyQueue lista = new MyQueue();
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.Imprimir();
        lista.ImprimirInv();
        lista.InsertarEn(25, 2);
        System.out.println("Lista despues de insertar:");
        lista.Imprimir();
        lista.BorrarEn(1, 0);
        System.out.println("Lista despues de borrar:");
        lista.Imprimir();
        System.out.println("Lista original:");
        lista.Imprimir();
        System.out.println("Peek: " + lista.peek());
        System.out.println("Pop: " + lista.pop());
        System.out.println("Lista despues de pop:");
        lista.Imprimir();
    }
    
}
