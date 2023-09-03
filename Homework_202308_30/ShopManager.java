package Homework_202308_30;
//оле products (массив товаров).
//Метод addProduct(Product product) для добавления товара в список.
//Метод getProductsByCategory(ProductCategory category) для получения списка товаров по заданной категории.
//Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка товаров в
//заданном диапазоне цен и в указанной валюте.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopManager {
        public Product[] products = new Product[5];
        public void run() {

            addProduct(new Product(5, "Coat", ProductCategory.CLOTHING, 45.00, Currency.EUR));
            getProductsByCategory(ProductCategory.CLOTHING);
            getProductsByNewPrice(10, 20, Currency.EUR);
        }
    private void addProduct(Product product) { //для добавления товара в список

        Product[] products = new Product[4];
        products[0] = new Product(1, "Dress", ProductCategory.CLOTHING, 30.00, Currency.EUR);
        products[1] = new Product(2, "Mineral water", ProductCategory.DRINK, 5.00, Currency.EUR);
        products[2] = new Product(3, "Sushi set", ProductCategory.FOOD, 20.50, Currency.EUR);
        products[3] = new Product(4, "Tablet", ProductCategory.ELECTRONICS, 60.50, Currency.EUR);


        Product[] addInProducts = new Product[8];

        System.out.println("Первый список товаров: " + Arrays.toString(products));

        System.arraycopy(products, 0, addInProducts, 0, products.length);
        addInProducts[products.length] = product;
        System.out.println("Список товаров после добавления нового товара: " + Arrays.toString(addInProducts));
    }

    private void getProductsByCategory(ProductCategory category) {

        for (Product i : products) {
            if (i.getCategory() == category) {
                System.out.println("Товары из указанной категории: " + i);
            }
        }

    private void getProductsByNewPrice(double minPrice, double maxPrice,Currency;
    {
            List<Product> newProducts = new ArrayList<>();
             for (int i = 0; i < products.length; i++) {
                 Product prod = products[i];
             }
            for (Product newProduct : newProducts) {
                System.out.println(newProduct.getName() + newProduct.getPrice() + newProduct);
            }
     }
 }
}