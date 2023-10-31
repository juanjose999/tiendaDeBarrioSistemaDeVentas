import java.util.Scanner;

public class EliminarProducto {
    public static void eliminarProducto(VerInventario inventario) {
        Scanner scanner = new Scanner(System.in);

        inventario.verTodosLosProductos();

        System.out.println("Ingrese el codigo del producto que desea eliminar: ");
        int codigoEliminar = scanner.nextInt();

        boolean eliminado = inventario.eliminarProducto(codigoEliminar);

        if(eliminado){
            System.out.println("Producto eliminado exitosamente");
        } else {
            System.out.println("No se encontro el producto con ese codigo");
        }

    }
}
