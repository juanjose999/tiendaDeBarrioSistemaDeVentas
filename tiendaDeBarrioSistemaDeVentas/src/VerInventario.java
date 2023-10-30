import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VerInventario {

    ArrayList<Producto> todosLosProductos = new ArrayList<>();

    public void verTodosLosProductos() {
        if (todosLosProductos.isEmpty()) {
            System.out.println("el inventario esta vacio.");
        } else {
            System.out.println("Lista de todos los productos en inventario: ");
            Iterator<Producto> iterator = todosLosProductos.iterator();

            while (iterator.hasNext()) {
                Producto producto = iterator.next();
                System.out.println("Código: " + producto.getProductCode() + "-" +
                        " Nombre: " + producto.getProductName() + "." +
                        " Precio: " + producto.getProductPrice() + "." +
                        " Descripcion: " + producto.getDescription() + "." +
                        " Cantidad: " + producto.getProductQuantity() + ";");
            }
        }
    }
    public  void agregarProducto(Producto producto){
        todosLosProductos.add(producto);
    }
    public void agregarProductos(List<Producto> productos) {
        todosLosProductos.addAll(productos);
    }
}
