public class ContarVocales {

    public static void main(String[] args) {
        String texto = "Recursividad en Java";
        
        // Paso 3: Llamada al método recursivo
        int totalVocales = vocales(texto); 
        
        System.out.println("La cadena es: \"" + texto + "\"");
        System.out.println("Número de vocales: " + totalVocales);
    }

    // Paso 2: Definición del método recursivo
    public static int vocales(String cadena) {
        // Caso base: si la cadena está vacía, devuelve 0
        if (cadena.isEmpty()) {
            return 0;
        }

        // Obtener el primer carácter en minúscula
        char c = Character.toLowerCase(cadena.charAt(0));

        // Verificar si el carácter es una vocal (incluyendo vocales con acento si fuera necesario)
        int esVocal = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                       c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') ? 1 : 0;

        // Llamada recursiva con el resto de la cadena (substring desde el índice 1)
        return esVocal + vocales(cadena.substring(1));
    }
}public class ContarVocales {
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

