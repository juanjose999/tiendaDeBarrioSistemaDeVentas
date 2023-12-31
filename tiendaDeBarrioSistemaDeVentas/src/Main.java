import java.util.Scanner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean[] bandera = {false};
        VerInventario inventario = new VerInventario();
        RealizarVenta realizarVenta = new RealizarVenta();

        List<Producto> productosPredefinidos = CargarProducto.cargarProductosPredefinidos();
        inventario.agregarProductos(productosPredefinidos);

        while (!bandera[0]){
            System.out.println(
                    """
                            |o|                         /////////////\\\\\\
                            |o|                        (((((((((((((   \\\\\\
                            |o|                        ))) ~~      ~~   (((
                            |o|                        ((( (*)     (*)  )))
                            |o|                        )))     <        (((\s
                            |o|                        ((( '\\______/`   )))\s
                            |o|                        )))\\___________/(((\s
                            |o|                        (((   _)  (_    )))\s\s
                            |o|                              /\\__/\\""");
            System.out.println("±------------------------------------------±");
            System.out.println("|   Administrador Mi Tienda de Barrio      |");
            System.out.println("±------------------------------------------±");
            System.out.println("---Ingresa una opcion de las siguientes: ---");
            System.out.println("--------------------------------------------");
            System.out.println("1 - Agregar producto");
            System.out.println("2 - Ver todos los productos");
            System.out.println("3 - Buscar producto por su letra inicial");
            System.out.println("4 - Ordenar en orden alfabetico");
            System.out.println("5 - Eliminar producto");
            System.out.println("6 - Realizar venta");
            System.out.println("7 - Verificar Inventario");
            System.out.println("8 - Salir");
            System.out.println("--------------------------------------------");
            System.out.println("--------------------------------------------");
            int opcion = teclado.nextInt();
            handleUserChoice(opcion, inventario, realizarVenta, teclado, bandera);

        }
    }
    private static void handleUserChoice(int choice, VerInventario inventario, RealizarVenta realizarVenta, Scanner teclado, boolean[] bandera) {
        switch (choice) {
            case 1:
                CargarProducto.cargarProducto(inventario);
                break;
            case 2:
                inventario.verTodosLosProductos();
                break;
            case 3:
                ProductsArray.cargarProductosPredefinidos();
                ProductsArray.verProductos();
                System.out.println("Ingrese la letra para filtrar productos: ");
                char letra = teclado.next().charAt(0);
                ProductsArray.mostrarProductosQueComienzanCon(letra);
                break;
            case 4:
                ProductsArray.imprimirProductosEnOrdenAlfabetico();
                break;
            case 5:
                EliminarProducto.eliminarProducto(inventario);
                break;
            case 6:
                realizarVenta.ventaRealizada(inventario);
                break;
            case 7:
                VerInventario.verificarInventario(inventario);
            case 8:
                bandera[0] = true;
                break;
            default:
                System.out.println("Opción inválida.  Por favor, intenta de nuevo.");
        }
    }
}