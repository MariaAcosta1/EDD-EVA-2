
package eva2_2_lista_simple;

/**
 *
 * @author bisonte
 */
public class Lista_Simple {
    private Nodo inicio;
    private Nodo fin;
    private int length;
    
    public Lista_Simple(){
        inicio = null; //Al crear la lista, se crea vacia
        fin = null;
        length = 0;
        
    }
    //Siempre se agrega al final de la lista
    //Version 1: O(N) --> Se agrega al final. Se recorren todos
    //Version mejorada: O(1) --> Con nodo fin, ya no se recorren todos
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor); //Creo el nodo para el valor a insertar
        if(inicio == null){ 
            inicio = nuevo; //Nuevo es el primer nodo en la lista
            fin = nuevo;
        }else{//Lista con nodos
            //Movernos al final
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo); //Conecto nuevo al final de la lista*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        length++;
    }
    //O(N)
    public void Imprimir(){
        //Imprimir en orden inverso
        //O(N2)
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
    //0(N)
    //De O(N) a O(1)
    public int longitud(){
        return length;
    }
    //0(1)
    public boolean lista_Vacia(){
        if(inicio == null){ //Lista vacia? Verdadero
            return true;
        }else{//Lista con nodos
            return false;
        }
    }
    //0(1)
    public void Vaciar_lista(){
        inicio = null;
        fin = null;
        length = 0;
    }
    
    //VALIDAR: posicion tenga un valor valido
    //O(N)
    public int valorEn(int posicion)throws RuntimeException{
        //Exception
        //Validar posicion
        int tama = longitud();
        if(posicion >= 0 && posicion < tama){
          //que posiciones son validas? De 0(cero) a N-1(N es la cantidad de nodos)
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++){
                temp = temp.getSiguiente();
          }
          return temp.getValor();
        }else{
            throw new RuntimeException("La posicion " + posicion + " no es valida");
    }
}
    //Regresa la primera posicion en la lista
    //Regresa la posicion
    //O(N)
    public int EncontrarValor(int valor){
        Nodo temp = inicio;
        int posicion = 0;

        while(temp != null){
            if(temp.getValor() == valor){
                return posicion;
        }
        temp = temp.getSiguiente();
            posicion++;
    }

        return -1;
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
        temp.setSiguiente(nuevo);
        
        if(nuevo.getSiguiente() == null){
            fin = nuevo;
        }
    }
        length++;
    }
    public void BorrarEn(int posicion){
        int tama = longitud();

        if(posicion < 0 || posicion >= tama){
            throw new RuntimeException("La posicion " + posicion + " no es valida");
    }
        if(posicion == 0){
            inicio = inicio.getSiguiente();

        if(inicio == null){
            fin = null;
        }
    }else{
        Nodo temp = inicio;

        for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(temp.getSiguiente().getSiguiente());

        if(temp.getSiguiente() == null){
            fin = temp;
        }
    }
        length--;
    }
}
