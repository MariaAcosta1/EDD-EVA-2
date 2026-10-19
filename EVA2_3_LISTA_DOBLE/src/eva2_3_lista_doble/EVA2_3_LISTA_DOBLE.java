
package eva2_3_lista_doble;

public class EVA2_3_LISTA_DOBLE {

    public static void main(String[] args) {
        Lista_Doble lista = new Lista_Doble();
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
    }
    
}
