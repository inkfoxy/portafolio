package datos.unidad1.genericos;

public class MainGenericos{
	public static void main(String[] args) {
		Producto<?>[] inventario = new Producto<?>[4];

		inventario[0] = new Libro("java basico 1", 299, 300);
		inventario[1] = new Electronico("thinkpad", 299, 300);
		inventario[2] = new Libro("java basico 3", 299, 300);
		inventario[3] = new Electronico("xbox", 299, 300);

		for (Producto<?> p : inventario){
			p.mostrarDetalles();
		}
	}
}
