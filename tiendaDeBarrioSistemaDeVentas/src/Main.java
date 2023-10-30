import java.util.Scanner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean bandera = false;
        VerInventario inventario = new VerInventario();
        RealizarVenta realizarVenta = new RealizarVenta();

        List<Producto> productosPredefinidos = CargarProducto.cargarProductosPredefinidos();
        inventario.agregarProductos(productosPredefinidos);

        while (!bandera){
            System.out.println("--------------------------------------------");
            System.out.println("--- Sistem de ventas tienda de barrio ------");
            System.out.println("---Ingresa una opcion de las siguientes: ---");
            System.out.println("--------------------------------------------");
            System.out.println("1 - Cargar inventarios de productos");
            System.out.println("2 - Ver inventarios de productos");
            System.out.println("3 - Realizar venta");
            System.out.println("4 - Salir");
            System.out.println("--------------------------------------------");
            System.out.println("--------------------------------------------");
            int opcion = teclado.nextInt();

            if(opcion == 1){
                CargarProducto.cargarProducto(inventario);
            } else if(opcion == 2){
                inventario.verTodosLosProductos();
            } else if (opcion  == 3){
                realizarVenta.ventaRealizada(inventario);
            } else if(opcion == 4) {
                bandera = true;
            }else {
                System.out.println("introdusca una opcion correcta");
            }
        }
    }
}