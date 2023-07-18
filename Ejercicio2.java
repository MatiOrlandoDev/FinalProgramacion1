public class Ejercicio2 {
    public static void main(String[] args) {
        int [] ArrayEnteros = {10, 23, 7, 1111,99};

        int SumaEnteros = 0;

        for(int i = 0; i < ArrayEnteros.length; i++){
            SumaEnteros += ArrayEnteros[i];
        }
        System.out.println("la suma de todos los elementos del array es " + SumaEnteros);
    }
}
