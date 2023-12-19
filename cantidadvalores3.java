package Primertrabajo;
public class cantidadvalores3 {
	//Función para encontrar los números
   private static int encontrarNumeros(int[] Array, int numero) {
		int cantidad=0;
		for (int i = 0; i <= Array.length -1 ; i++) {	
		  if(Array[i]==numero) {
		   cantidad++;
		  }
		}
		return cantidad;
   }	
	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		int numero= encontrarNumeros(tabla, 3);	
		//Para mostrar el mensaje en pantalla
         System.out.println("Hay un total de "+ numero + " numeros 3"  );
		
	}
}