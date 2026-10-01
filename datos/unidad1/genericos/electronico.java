package datos.unidad1.genericos;

public class Electronico extends Producto<Integer>{
        public Electronico(String nombre, double precio,Integer whats){
                super(nombre, precio, whats);
        }

	public void mostrarDetalles(){
                String datos= "Nombre: " + super.nombre + "\nPrecio: " + super.precio + "\nWhats que consume: " + super.getExtra();

                System.out.println(datos);
        }
}
