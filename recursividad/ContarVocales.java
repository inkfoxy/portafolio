public class ContarVocales {
	public static void main(String[] args) {
		String texto = "Recursividad en Java";
		int totalVocales = vocales(texto, 0); // Aquí llamaremos al método recursivo
		System.out.println("La cadena es: " + texto);
		System.out.println("Número de vocales: " + totalVocales);
	}
	public static int vocales(String cadena, int contador) {
		// Caso base: cadena vacía
		if (cadena == "") {
			return contador;
		}
		else{
			// Primer carácter
			char c = Character.toLowerCase(cadena.charAt(0));
			// Verificar si es vocal
			if(c == ){
				int esVocal = contador + 1;
			}else{
				int esVocal = contador;
			}
		// Llamada recursiva
		vocales(cadena - c, esVocal);
		}
	}
}

