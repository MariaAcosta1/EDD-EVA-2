
package eva2_4_queue;

/**
 *
 * @author bisonte
 */
public class Nodo {
    //Dos atributos
    private int valor; //data
    private Nodo siguiente; //next
    private Nodo previo;
    //Constructores:

    public Nodo(Nodo previo) {
        this.previo = previo;
    }
    
    public Nodo(){
        this.siguiente = null; //Esto es muy importante, marca el fin de la lista
        this.previo = null;
    }
    public Nodo(int valor) { //Poner el valor a guardar, al momento de crear el nodo
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
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
    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
}
