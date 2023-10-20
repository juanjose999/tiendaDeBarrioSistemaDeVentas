import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RealizarVenta {
    private List<ProductoVendido> productosVendidos = new ArrayList<>();
    private BigDecimal tasaImpuesto = new BigDecimal("0.19");

    public void agregarProducto(Producto producto, int cantidad) {
        ProductoVendido productoVendido = new ProductoVendido(producto, cantidad);
        this.productosVendidos.add(productoVendido);
    }

    public  BigDecimal calcularTotalVenta() {
        BigDecimal total = BigDecimal.ZERO;
        for (ProductoVendido productoVendido : this.productosVendidos) {
            total = total.add(productoVendido.calcularSubtotal());
        }
        return total.multiply(BigDecimal.ONE.add(tasaImpuesto));
    }

    public void ventaRealizada(VerInventario inventario) {
        List<Producto> productosVendidos = CargarProducto.cargarProductosParaVenta(inventario);
        for (Producto producto : productosVendidos) {
            this.agregarProducto(producto, producto.getCantidad());
        }
        BigDecimal totalVenta = this.calcularTotalVenta();
        System.out.println("--------------------------------------------");
        System.out.printf("---------Total de la venta: %d\n", totalVenta.setScale(0, BigDecimal.ROUND_HALF_UP).intValue());
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    private static class ProductoVendido {
        private Producto producto;
        private int cantidad;

        public ProductoVendido(Producto producto, int cantidad) {
            this.producto = producto;
            this.cantidad = cantidad;
        }

        public BigDecimal calcularSubtotal() {
            return BigDecimal.valueOf(producto.getPrecio()).multiply(BigDecimal.valueOf(cantidad));
        }

    }
}
