import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private HashMap<String, Product> products = new HashMap<>();
    // Додавання товару
    public void addProduct(Product product) {
        if (products.containsKey(product.getProductCode())) {
            System.out.println("Товар з кодом "+ product.getProductCode()+ " вже існує");
        }
        else {
            products.put(product.getProductCode(), product);
            System.out.println("Товар додано: "+ product.getName());
        }
    }
    // Видалення товару за кодом
    public void removeProduct(String productCode) {
        Product removed = products.remove(productCode);
        if (removed != null) {
            System.out.println("Товар видалено: " + removed.getName());
        }
        else {
            System.out.println("Товар з кодом "+ productCode+ " не знайдено");
        }
    }
    // Пошук товару за кодом
    public Product findProduct(String productCode) {
        return products.get(productCode);
    }
    // Виведення всіх товарів
    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Інвентар порожній");
            return;
        }
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
