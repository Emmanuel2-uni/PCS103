public class App {

    public static void main(String[] args) throws Exception {

        ShoppingCart shop = new ShoppingCart();

        // The instructions say that we need to use CalculateCost() to calculate the price according the unique variables (page, warranty, size)
        // but we declare the price anyway in the constructor???????????????????????????

        shop.addProduct(new Book("Java", "B001", 549.0, 50));
        shop.addProduct(new Electronics("Smarthphone", "E001", 1549.0, 50));
        shop.addProduct(new Clothing("TShirt", "C001", 249.0, "Large"));

        shop.displayTotal();


    }

}