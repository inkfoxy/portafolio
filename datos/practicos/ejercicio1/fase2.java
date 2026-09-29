package datos.practicos.ejercicio1;
public class fase2{
	public static void matris(int[][] valores){
		int[] suma = {0,0,0,0};
		int[] diagonal = {0,0,0,0};
		for(int y = 0;y < valores.length ; y++){
			for(int x = 0; x < valores[y].length ; x++){
				suma[y] = suma[y] + valores[y][x];
				if(x==y){
					diagonal[y]=valores[y][x];
				}
			}
			System.out.println("la suma de la tienda " + (y+1) + " es de: " + suma[y]);
		}
		System.out.println("la diagonal principal es: " + diagonal[0] + ", " + diagonal[1] + ", " + diagonal[2] + ", " + diagonal[3]);
	}
	public static void main(String[] args){
		int[][] matris ={
			{10,20,15,5},
			{8,3+5,12,30},
			{25,14,0,18},
			{2,9,11,40}
		};
		matris(matris);
		//la diferencia entre ambos tipos de arreglos es que un arreglo bidimencional solo serviria de forma correcta en una solucion con una matriz simetrica, es desir que todas sus filas y columnas son iguales y uno dentado te serviria si ocupas tener filas de distintos tamaños
	}
}
