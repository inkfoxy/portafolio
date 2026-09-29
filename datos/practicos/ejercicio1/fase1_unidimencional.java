package datos.practicos.ejercicio1;
public class fase1_unidimencional{
	public static void fase1(int[] valor, int n, int suma, int contador){//se crea una clase que se va a llamar despues de forma recursiva
		if (n < 0){//cuando el programa termina de revisar el arreglo saca el resultado de las temperaturas psoiticas mediante la suma de estas y un contador
			int resultado = suma / contador;
			System.out.println("el promedio de las temperaturas posivas es: "+ resultado);
			return;
		}else{
			if (valor[n] <= 0){//el programa comprueva si el valor en el arreglo es positivo o negativo
				System.out.println("hay una temperatura bajo cero en el sensor : "+ n);//si es negativo te debuelve el numero del arreglo en donde se encontro
				fase1(valor, n -1, suma, contador);
			}else{
				suma = suma + valor[n];//si es positivo suma el valor a una variavle que contiene la suma de los anteriores
				contador = contador + 1;//y agrega un uno al contador para saber cuantos positivos hay
				fase1(valor, n -1, suma, contador);
			}
		}
	}
	public static void main(String[] args){
		int[] temperaturas={12,-3,4,8,-1,3,15,2};
		fase1(temperaturas, temperaturas.length -1, 0, 0);
	//al momento de crear un arreglo se crea con un tamaño espesifico y se asignan valores a ese tamaño, si se busca un indice que no este en el arreglo, como no existe un espacio reservado o un valor para este el programa se detiene y no sabe que regresar, por lo que te marca un error.
	}
}
