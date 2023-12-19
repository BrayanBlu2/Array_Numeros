package Primertrabajo;
public class secuenciaDeNumeros {
    private static boolean esSimetrica(int[] array) {
	   int longitud = array.length;
	   //Para leer la secuencia de deracha ha izquierda y despues compararla
	   for (int i = 0; i < longitud / 2; i++) {
	       if (array[i] != array[longitud - 1 - i]) {
	           return false;
	       }
	   }
	  return true;
	}
  public static void main(String[] args) {
	   int tabla[] = {3, 6, 2, 77, 77, 2, 6, 3};
	  //Para mostrar el mensaje en pantalla segun el resultado de la comparación
	   if (esSimetrica(tabla)) {
	       System.out.println("La secuencia es la misma de izquierda a derecha.");
	   } else {
	       System.out.println("La secuencia no es la misma de izquierda a derecha.");
	   }
  }
}
