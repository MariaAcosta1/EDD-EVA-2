
package eva2_3_lista_doble;

public class Lista_Doble {
    private Nodo inicio;
    private Nodo fin;
    private int length;
    
    public Lista_Doble(){
        inicio = null; //Al crear la lista, se crea vacia
        fin = null;
    }
    public void Imprimir(){
        //Imprimir en orden inverso
        //O(N)
        Nodo temp = inicio;
        while(temp != null){
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
    }
    
    public int longitud(){
        return length;
    }
    
    public boolean lista_Vacia(){
        if(inicio == null){ //Lista vacia? Verdadero
            return true;
        }else{//Lista con nodos
            return false;
        }
    }
    
    public void Vaciar_lista(){
        inicio = null;
        fin = null;
        length = 0;
    }
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor); 
        if(inicio == null){ 
            inicio = nuevo; 
            fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);
            //conectar previo
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        length++;
    }
    public void ImprimirInv(){
        int[] valor = new int[length];
        Nodo temp = inicio;
        int i = 0;
        
        while(temp != null){
            valor[i] = temp.getValor();
            temp = temp.getSiguiente();
            i++;
        }
        for(i = length - 1; i >= 0; i--){
        System.out.println("[" + valor[i] + "]");
    }
    }
    
    public int valorEn(int posicion)throws RuntimeException{
        int tama = longitud();
        if(posicion >= 0 && posicion < tama){
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++){
                temp = temp.getSiguiente();
          }
          return temp.getValor();
        }else{
            throw new RuntimeException("La posicion " + posicion + " no es valida");
    }
    }
    public void InsertarEn(int valor, int posicion){
        //Validar posicion
        //Determinar estado de la lista (vacia, no vacia)
        //Insertar al inicio o en cualquier posicion
        int tama = longitud();

        if(posicion < 0 || posicion > tama){
            throw new RuntimeException("La posicion " + posicion + " no es valida");
    }
        Nodo nuevo = new Nodo(valor);

        if(posicion == 0){
            nuevo.setSiguiente(inicio);

        if(inicio != null){
            inicio.setPrevio(nuevo);
        }

        inicio = nuevo;

        if(fin == null){
            fin = nuevo;
        }
    }else{
        Nodo temp = inicio;

        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguiente();
        }

        nuevo.setSiguiente(temp.getSiguiente());
            nuevo.setPrevio(temp);

        if(temp.getSiguiente() != null){
            temp.getSiguiente().setPrevio(nuevo);
        }else{
            fin = nuevo;
        }

        temp.setSiguiente(nuevo);
    }

    length++;
    }

    public void BorrarEn(int posicion, int valor){
        int tama = longitud();

        if(posicion < 0 || posicion >= tama){
            throw new RuntimeException("La posicion " + posicion + " no es valida");
    }
        if(posicion == 0){
        inicio = inicio.getSiguiente();

        if(inicio != null){
            inicio.setPrevio(null);
        }else{
            fin = null;
        }
    }else{
        Nodo temp = inicio;

        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguiente();
        }

        Nodo eliminado = temp.getSiguiente();

        temp.setSiguiente(eliminado.getSiguiente());

        if(eliminado.getSiguiente() != null){
            eliminado.getSiguiente().setPrevio(temp);
        }else{
            fin = temp;
        }
    }

    length--;
    }
    //nuevo.siguiente = nuevo
    //inicio.previo = nuevo
    //inicio = nuevo
    
    //nuevo.siguiente = temp
    //nuevo.previo = temp.previo
    //temp.previo.siguiente = nuevo 
    //temp.previo = nuevo 
}
