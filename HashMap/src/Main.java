public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product("A001", "Молоко", 20));
        inventory.addProduct(new Product("A002", "Хліб", 35));
        inventory.addProduct(new Product("A003", "Сир", 12));
        inventory.addProduct(new Product("A001", "Кефір", 5)); // дублікат коду
        System.out.println("\nУсі товари:");
        inventory.printAllProducts();
        System.out.println("\nПошук за кодом A002:");
        Product found = inventory.findProduct("A002");
        System.out.println(found != null ? found : "Товар не знайдено");
        System.out.println("\nВидалення A003:");
        inventory.removeProduct("A003");
        inventory.removeProduct("A999"); // неіснуючий
        System.out.println("\nУсі товари після видалення:");
        inventory.printAllProducts();
    }
}