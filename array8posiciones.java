package Primertrabajo;
public class array8posiciones {
  static boolean seRepite(int t[],int numero ,int cantidad) {
	//comprobar si el numero ya esta repetido en un array
	  for(int i=0; i < cantidad; i++) {
		  if(t[i]==numero) {
		   return true;
		  }
	  }
	  return false;	  
  }
	
	public static void main(String[] args) {
		
	 int numeros[] = new int[8];
	 //calcular 8 posisiones diferentes
	   for (int i = 0; i < numeros.length ; i++) {
       int aleatorio = (int)Math.floor(Math.random()*40);
       numeros[i]=aleatorio;
       seRepite(numeros, aleatorio, i);
       while (seRepite(numeros, aleatorio, i)) {
    	   aleatorio = (int)Math.floor(Math.random()*40);
       }
		numeros[i] =aleatorio;
	   }
	   //visualizar la tabla
		  for (int i = 0; i < numeros.length; i++) {			
		   System.out.println(numeros[i]);
          }
	}
}


