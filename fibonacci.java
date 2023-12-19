package Primertrabajo;

public class fibonacci {

 public static void main(String[] args) {		
	    int fibonacciArray[] = new int[20];
       // Especificar los primeros dos elementos de la tabla fibonacci
   fibonacciArray[0] = 0;
   fibonacciArray[1] = 1;
   // Calcular y almacenar los valores restantes de la secuencia Fibonacci
   for (int i = 2; i < 20 ; i++) {
       fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
   }
	   // Imprimir el array con los valores de la secuencia Fibonacci
	   System.out.println("Array con valores de la secuencia Fibonacci:");
	   for (int i = 0; i < 20; i++) {
	       System.out.print(fibonacciArray[i] + " ");
	   }

 }
}
