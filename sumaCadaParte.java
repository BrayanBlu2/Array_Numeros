package Primertrabajo;
public class sumaCadaParte {
	//función para sumar
	private static int calcularSuma(int[] array, int inicio, int fin) {
       int suma = 0;
       for (int i = inicio; i < fin; i++) {
           suma += array[i];
       }
       return suma;
      }		
  public static void main(String[] args) {						
   int tabla[] = {3, 6, 2, 7, 3, 3, 6, 2, 7, 3};
   //Para calcular la suma de cada lado
   int sumaIzquierda = calcularSuma(tabla, 0, tabla.length / 2);
   int sumaDerecha = calcularSuma(tabla,  tabla.length / 2, tabla.length);
   //Poner el mensaje en la pantalla segun el resultado
    if (sumaIzquierda > sumaDerecha) {
         System.out.println("La suma del lado izquierdo es más grande: " + sumaIzquierda);
    }   else if (sumaIzquierda < sumaDerecha) {
            System.out.println("La suma del lado derecho es más grande: " + sumaDerecha);
	         } else {
	        	 System.out.println("Las sumas son iguales, suma derecha: " + sumaDerecha + ", suma izquierda: " + sumaIzquierda);
	          }
  }
}	
