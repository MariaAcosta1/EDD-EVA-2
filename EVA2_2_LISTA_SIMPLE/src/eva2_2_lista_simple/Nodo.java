
package eva2_2_lista_simple;

/**
 *
 * @author bisonte
 */
public class Nodo {
    //Dos atributos
    private int valor; //data
    private Nodo siguiente; //next
    //Constructores:
    
    public Nodo(){
        this.siguiente = null; //Esto es muy importante, marca el fin de la lista
    }
    public Nodo(int valor) { //Poner el valor a guardar, al momento de crear el nodo
        this.valor = valor;
        this.siguiente = null;
    }
    //get y set}

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
}
