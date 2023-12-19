package Primertrabajo;
public class masParesOImpares {
	//Función para ver cuantos pares hay
	static int contarPares(int[] Array) {
	int cantidadPares =0;			
		for(int i=0; i<Array.length; i++) {
			if(Array[i]%2==0) {
			cantidadPares ++;
			}
		}
		return cantidadPares;
	}		
  public static void main(String[] args) {
			
	int tabla[]= {3,6,2,77,3,10,23,14,3};
	int pares = contarPares(tabla);
	//Para calcular los impares
	int impares = tabla.length - pares;
		
	//Para mostrar en pantalla segun el caso que sea
	 if(pares>impares) {
		 System.out.println("Hay más pares que impares " );
	
	}else if (impares>pares) {
		System.out.println("Hay más impares que pares " );
	}else 			
		System.out.println("Hay la misma cantidad de pares que impares " + pares + " : " + impares);		
  }
}