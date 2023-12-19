package Primertrabajo;
public class arrayde10valores {
	//Función para calcular la factorial
	static int factorial(int x){
	if(x==0 || x==1)
		return 1;
		else
		return x*factorial(x-1);
	}	   
			
   public static void main(String[] args) {

		int tabla[]=new int[10];
		//Rellenar la tabla con factoriales
		for (int i=0;i<tabla.length;i++)
		tabla[i]= factorial(i);
		//Mostrar la tabla en pantalla
		for (int i=0;i<tabla.length ;i++)
		System.out.println(i + " : " + tabla[i]);
			
   }
}
				
