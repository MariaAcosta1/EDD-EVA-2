
package eva2_12_arbol_binario;

/**
 *
 * @author MARIA
 */
public class Arbol_Binario {
    private Nodo Root;

    public Arbol_Binario() {
        Root = null;
    }
    
    public void agregar(int valor){
        //Esta vacio el arbol
        if(Root == null){//arbol vacio
            Root = new Nodo(valor);//insertar el valor
        }else{
            agregarRecu(Root, valor);
        }
    }
    //Metodo recursivo para agregar un nodo
    private void agregarRecu(Nodo actual, int valor){
        if(valor > actual.getValor()){//A la derecha
            if(actual.getDerecha() != null){//Ocupado
                agregarRecu(actual.getDerecha(), valor);
            }else{//disponibe
                actual.setDerecha(new Nodo(valor));
            }
        }else if(valor < actual.getValor()){//A la izquierda
            if(actual.getIzquierda() != null){//Ocupado
                agregarRecu(actual.getIzquierda(), valor);
            }else{//disponibe
                actual.setIzquierda(new Nodo(valor));
            }
        }/*Else --> el valor esta repetido*/
    }
    
    public void preOrder(){
        preOrderRecu(Root);
    }
    
    private void preOrderRecu(Nodo actual){
        if(actual != null){
        System.out.println(actual.getValor());
        preOrderRecu(actual.getIzquierda()); //Leer el lado izquierdo
        preOrderRecu(actual.getDerecha()); //Leer el lado derecho}
        }
    }
    public void InOrder(){
        InOrderRecu(Root);
    }
    //de menor a mayor
    private void InOrderRecu(Nodo actual){
        if(actual != null){
        InOrderRecu(actual.getIzquierda()); //Leer el lado izquierdo
        System.out.println(actual.getValor());
        InOrderRecu(actual.getDerecha()); //Leer el lado derecho
        }
    }
    
    public void postOrder(){
        postOrderRecu(Root);
    }
    //
    private void postOrderRecu(Nodo actual){
        if(actual != null){
        postOrderRecu(actual.getIzquierda()); //Leer el lado izquierdo
        postOrderRecu(actual.getDerecha()); //Leer el lado derecho}
        System.out.println(actual.getValor());
        }
    }
}
