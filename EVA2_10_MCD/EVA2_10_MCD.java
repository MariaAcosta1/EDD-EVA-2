
package eva2_10_mcd;

public class EVA2_10_MCD {

    public static void main(String[] args) {
        System.out.println("Maximo comun divisor es: " + mcd(180, 48));
    }
    public static int mcd(int a, int b){
        int resi = a % b;

        System.out.println(resi);

        if (resi == 0) {
            return b;
    }else{
        return mcd(b, resi);
    }
    }
}