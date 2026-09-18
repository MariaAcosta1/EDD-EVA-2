
package eva2_1_referencias;

public class EVA2_1_REFERENCIAS {

    public static void main(String[] args) {
        Ejemplo inicio = new Ejemplo();
        inicio.vlr = 100; //primer objeto
        System.out.println("Inicio = " + inicio);
        System.out.println("Inicio.vlr = " + inicio.vlr);
        System.out.println("Inicio.otro = " + inicio.otro);
        //Crear una lista:
        inicio.otro = new Ejemplo();
        inicio.otro.vlr = 200; //segundo objeto
        inicio.otro.otro = new Ejemplo();
        inicio.otro.otro.vlr = 300; //tercer objeto
        inicio.otro.otro.otro = new Ejemplo();
        inicio.otro.otro.otro.vlr = 400;
        
        Ejemplo sig = inicio;
        while(sig != null){
            System.out.print("[" + sig.vlr + "]");
            sig= sig.otro;
        }
    }
    
}
class Ejemplo{
    int vlr;
    Ejemplo otro;
}