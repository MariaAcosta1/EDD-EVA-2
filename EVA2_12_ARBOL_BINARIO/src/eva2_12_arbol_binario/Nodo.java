
package eva2_12_arbol_binario;

/**
 *
 * @author bisonte
 */
public class Nodo {
    //Dos atributos
    private int valor; //data
    private Nodo derecha; //next
    private Nodo izquierda;
    //Constructores:

    public Nodo(Nodo previo) {
        this.izquierda = previo;
    }
    
    public Nodo(){
        this.derecha = null; //Esto es muy importante, marca el fin de la lista
        this.izquierda = null;
    }
    public Nodo(int valor) { //Poner el valor a guardar, al momento de crear el nodo
        this.valor = valor;
        this.derecha = null;
        this.izquierda = null;
    }
    //get y set}

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
    
}
