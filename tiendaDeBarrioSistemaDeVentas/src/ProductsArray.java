import java.util.Arrays;

public class ProductsArray {

    private static Producto[] productos;

    public ProductsArray(int capacidad) {
        // Inicializar el array de productos con la capacidad especificada
        this.productos = new Producto[capacidad];
    }

    public static void cargarProductosPredefinidos(Producto[] productosPredefinidos) {
        // Copiar los productos predefinidos al array de productos
        System.arraycopy(productosPredefinidos, 0, productos, 0, productosPredefinidos.length);
    }

    public static void cargarProductosPredefinidos() {
        // Inicializar los productos predefinidos
        Producto[] productosPredefinidos = {
                new Producto(1, "Leche Entera Alpina", 3500, "Bolsa x 1.100 ml", 42),
                new Producto(2, "Papas fritas", 3500, "Bolsa x 1.100 ml", 42),
                new Producto(3, "Yogurt", 3500, "Bolsa x 1.100 ml", 42),
                new Producto(4, "BonYour", 3800, "Vaso x 196 ml", 46),
                new Producto(5, "Papas Margarita de Todito natural", 2200, "Bolsa x 400", 66),
                new Producto(6, "Choclitos Margarita", 2600, "Bolsa x 130gr", 33),
                new Producto(7, "Mortadela Rica", 6400, "Bolsa x 240gr", 44),
                new Producto(8, "Papas Yupi Rizadas", 2600, "Bolsa x 130gr", 12),
                new Producto(9, "Jamon Zenu", 8700, "Bolsa x 240gr", 54),
                new Producto(10, "Jamon pietran", 12400, "Bolsa x 250gr", 12),
                new Producto(11, "Sachicha Rica", 9600, "Bolsa x 450gr", 54),
                new Producto(12, "Chorizo Rica", 12300, "Bolsa x 660gr", 34),
                new Producto(13, "Morcilla Colanta", 14300, "Bolsa x 4 unidades", 12),
                new Producto(14, "Rollo de carne", 9600, "Bolsa x 220gr", 54),
                new Producto(15, "Huevo tipo A", 12000, "Cubeta 30", 34),
                new Producto(16, "Queso alpina Campesino", 15600, "Bolsa x 120gr", 24),
                new Producto(17, "Margarina La Fina", 5600, "Barra x 12gr", 34),
                new Producto(18, "Mantequilla rama", 6600, "Barra x 8gr", 54),
                new Producto(19, "Crema de leche Alqueria", 14400, "Bolsa x 900ml", 44),
                new Producto(20, "Kumis Alpina", 3900, "Vaso x 12gr", 54),
        };

        // Obtener una instancia de ProductsArray
        ProductsArray productsArray = new ProductsArray(productosPredefinidos.length);

        // Copiar los productos predefinidos al array de productos
        System.arraycopy(productosPredefinidos, 0, productsArray.productos, 0, productosPredefinidos.length);
    }
    public static void mostrarProductosQueComienzanCon(char letra) {
        // Mostrar productos que comienzan con una letra específica
        System.out.println("Productos que comienzan con la letra '" + letra + "':");
        for (Producto producto : productos) {
            if (producto != null && Character.toLowerCase(producto.getProductName().charAt(0)) == Character.toLowerCase(letra)) {
                System.out.println(producto);
            }
        }
    }

    public static void verProductos() {
        // Mostrar todos los productos
        System.out.println("Todos los productos:");
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println(producto);
            }
        }
    }

    public static void imprimirProductosEnOrdenAlfabetico() {
        // Filtrar los productos no nulos
        Producto[] productosFiltrados = Arrays.stream(productos)
                .filter(producto -> producto != null)
                .toArray(Producto[]::new);

        // Ordenar los productos por nombre
        Arrays.sort(productosFiltrados, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));

        // Imprimir la lista de productos en orden alfabético
        System.out.println("Lista de productos en orden alfabético:");
        for (Producto producto : productosFiltrados) {
            System.out.println(producto);
        }
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Producto producto : productos) {
            if (producto != null) {
                result.append(producto).append("\n");
            }
        }
        return result.toString();
    }

}
