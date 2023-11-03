public class Producto {
        private int productCode;
        private String productName;
        private double productPrice;
        private String description;
        private int productQuantity;

    public Producto(int productCode, String productName, double productPrice, String description, int productQuantity){
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.description = description;
        this.productQuantity = productQuantity;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public String toString() {
        return String.format("ID: %d, Nombre: %s, Precio: %s, Stock: %d",
                this.productCode, this.productName, this.productPrice,this.productQuantity);
    }
}
