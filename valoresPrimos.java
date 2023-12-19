package Primertrabajo;
public class valoresPrimos {
	//Función para ver cuales son números primos
private static boolean esPrimo(int numero) {
	   if (numero < 2) {
	       return false;
	   }
	   for (int i = 2; i <= Math.sqrt(numero); i++) {
	       if (numero % i == 0) {
	           return false;
	       }
	   }
	   return true;
}
//Función para contar loa cantidad de números primos que hay
   private static int contarNumerosPrimos(int[] array) {
	   int cantidadPrimos = 0;
	   for (int i = 0; i < array.length; i++) {
	       if (esPrimo(array[i])) {
	           System.out.println(array[i] + " es primo.");
	           cantidadPrimos++;
	       } else {
	           System.out.println(array[i] + " no es primo.");
	       }
	   }
	   return cantidadPrimos;
   }
 public static void main(String[] args) {
		   int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};
		   int esPrimo = contarNumerosPrimos(tabla);
		   //Para mostrar en pantalla todos los numeros y decir si sin primos o no
		   System.out.println("Cantidad de números primos en la tabla: " + esPrimo);
 }
}
