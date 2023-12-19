package Primertrabajo;
public class sonTodosDiferentes {
   private static boolean sonTodosDiferentes(int[] array) {
	//función para comparar
	for (int i = 0; i < array.length - 1; i++) {
		//primer bucle para seleccionar el número de la tabla que queremos comparar
	    for (int j = i + 1; j < array.length; j++) {
	        //Segundo bucle para comparar el número del primer bucle con los demás
	    	if (array[i] == array[j]) {
	          System.out.println(array[j] + " = " + array[i]);
	          return false; // Hay mínimo un número  igual a otro
	        }
	    }
	}
	return true; // No hay ningún número que sea igual a otro
   }	
   public static void main(String[] args) {
       int tabla[] = {3, 6, 2, 77, 5, 10, 3, 14};
       //Para mostrar en pantalla si hay o no repetidos
       if (sonTodosDiferentes(tabla)) {
           System.out.println("Todos los números son diferentes");
       } else {
           System.out.println("Hay al menos dos números repetidos");
       }
   }
}
