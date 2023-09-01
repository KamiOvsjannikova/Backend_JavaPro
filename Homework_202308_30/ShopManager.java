package Homework_202308_30;

import java.util.ArrayList;
import java.util.List;

class ShopManager {
    private List<Product> products;

    public ShopManager() {
        products = new ArrayList<>();
    }

    // Метод для добавления товара в список
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для получения списка товаров по заданной категории
    public List<Product> getProductsByCategory(ProductCategory category) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory() == category) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }

    // Метод для получения списка товаров в заданном диапазоне цен и в указанной валюте
    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        List<Product> productsByPriceRange = new ArrayList<>();
        for (Product product : products) {
            if (product.getCurrency() == currency && product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                productsByPriceRange.add(product);
            }
        }
        return productsByPriceRange;
    }
}