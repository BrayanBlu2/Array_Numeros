package Primertrabajo;
public class valoresDivisibles {
    private static int divisiblesEntre7(int[] array) {
	   int divisibles = 0;
	   for (int i = 0; i < array.length; i++) {
	       if (array[i] % 7 == 0) {
	           divisibles ++;
	       }
	   }
	   return divisibles;
	}
	public static void main(String[] args) {
		int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};
       int divisibles = divisiblesEntre7(tabla);
       System.out.println("La cantidad de números que se pueden dividir entre 7 son: " + divisibles);
   }
}
