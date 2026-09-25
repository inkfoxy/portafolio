package datos.unidad1.recursividad;
public class Recursividad {
	public static void Saludo(int total, String nombre) {
	
	        if(total <= 0)
                	return;
        	else{
             		System.out.println("Hola " + nombre);
       	        	Saludo(total-1,nombre);
        	}
	
        }

       	public static void cuentaRegresiva(int n){
	       	if (n < 1){
                       	return;
               	}else{ 
                       	System.out.print(n + " ");
                       	cuentaRegresiva(n-1);
	       	}
       	}

	public static void sumaRecursiva(int[] datos, int longitud, int suma) {

		if (longitud < 0) {
			System.out.println("el resultado es: " + suma);
			return;
		}else{
			suma = suma + datos[longitud];
			sumaRecursiva(datos, longitud -1, suma);
		}
	}
        public static void main(String[] args){
                //Saludo(10, "ricardo");
		//cuentaRegresiva(100);
		int[] numeros = {20,20,20,7};
		sumaRecursiva(numeros, numeros.length -1, 0);

        }
}

