package Primertrabajo;
public class cambia1PosicionTodos {
  private static void rotarArray(int[] array) {
		//Función para mover y guardar la posición
       int temp = array[array.length -1];
       for (int i = array.length - 1; i > 0; i--) {
           array[i] = array[i - 1];
       }
       array[0] = temp;
   }
   public static void main(String[] args) {	
	int tabla[] = {3, 6, 2, 77, 5, 10, 8, 14};	
	// Rotar la tabla 1 hacia la derecha
	rotarArray(tabla);
	   //Para ver como ha rotado
	   System.out.println("Array rotado:");
	   for (int i = 0; i < tabla.length; i++) {
	       System.out.print(tabla[i] + " ");
	   }
   }
}
