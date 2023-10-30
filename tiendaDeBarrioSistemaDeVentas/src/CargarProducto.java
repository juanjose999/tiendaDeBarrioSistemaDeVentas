import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class CargarProducto {
    private static Scanner teclado = new Scanner(System.in);

    public static Producto cargarProducto(VerInventario verInventario) {
        System.out.println(
                "Ingrese el codigo del producto: ");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = teclado.next();
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        teclado.nextLine(); // Consume the newline character
        System.out.println(
                "Ingrese la descripcion del producto: ");
        String descripcion = teclado.next();
        teclado.nextLine(); // Consume the newline character
        System.out.println("Ingrese la cantidad de productos a agregar: ");
        int cantidad = Integer.parseInt(teclado.nextLine());

        Producto newProducto = new Producto(codigo, nombre, precio, descripcion, cantidad);
        verInventario.agregarProducto(newProducto);

        System.out.println("Se ha agregado el producto correctamente");
        return newProducto;
    }
    public static List<Producto> cargarProductosParaVenta(VerInventario inventario) {
        List<Producto> productosParaVenta = new ArrayList<>();

        inventario.verTodosLosProductos(); // Mostrar la lista de productos para elegir
        System.out.println("Ingrese el código del producto para la venta: ");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese la cantidad de productos a vender: ");
        int cantidad = teclado.nextInt();

        // Buscar el producto en el inventario
        for (Producto producto : inventario.todosLosProductos) {
            if (producto.getProductCode() == codigo) {
                // Verificar si hay suficiente cantidad en inventario
                if (producto.getProductQuantity() >= cantidad) {
                    // Crear una copia del producto con la cantidad deseada y agregarlo a la venta
                    Producto productoVenta = new Producto(producto.getProductCode(), producto.getProductName(),
                            producto.getProductPrice(), producto.getDescription(), cantidad);
                    productosParaVenta.add(productoVenta);
                    System.out.println("--------------------------------------------");
                    System.out.println("---------------- Factura -------------------");
                } else {
                    System.out.println("No hay suficiente cantidad en inventario.");
                }
                break;
            }
        }

        return productosParaVenta;
    }
    public static List<Producto> cargarProductosPredefinidos() {
        List<Producto> productos = new ArrayList<>();

        //Lista de productos precargados
        Producto lecheAlpina = new Producto(01, "Leche Entera Alpina", 3500, "Bolsa x 1.100 ml", 42);
        productos.add(lecheAlpina);

        Producto lecheColanta = new Producto(02, "Leche Colanta Entera", 3000, "Bolsa x 1.100 ml", 42);
        productos.add(lecheColanta);

        Producto BedidaJappi = new Producto(03, "Bebida Jappi Almendra", 9300, "Caja X 900 ml", 42);
        productos.add(BedidaJappi);

        Producto YogurtAlpina = new Producto(04, "Yogurt Alpina Fresa", 2300, "Vaso x 150 ml", 22);
        productos.add(YogurtAlpina);

        Producto PapasSuperRicas = new Producto(05, "Papas Super Ricas", 5600, "Bolsa x 180gr", 42);
        productos.add(PapasSuperRicas);



        return productos;
    }
}