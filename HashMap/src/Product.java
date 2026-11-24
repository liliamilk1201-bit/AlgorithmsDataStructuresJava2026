import java.util.HashMap;
import java.util.Map;

public class Product {
    private String productCode;
    private String name;
    private int quantity;
    public Product(String productCode, String name, int quantity) {
        this.productCode = productCode;
        this.name = name;
        this.quantity = quantity;
    }
    public String getProductCode() {
        return productCode;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Код: "+ productCode+ ", назва: "+ name + ", кількість: "+ quantity;
    }
}
