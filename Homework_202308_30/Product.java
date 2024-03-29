package Homework_202308_30;
//2. Классы:
       // 2.1. Product - Класс для представления товара:
        //Поля:
       // id (уникальный идентификатор товара)
      //  name (имя товара)
       // category (категория товара из ProductCategory)
     //   price (цена товара)
       // currency (валюта цены из Currency)
       // Конструктор для инициализации полей.
public class Product {
    private int id;
    private String name;
    private ProductCategory category;
    private double price;
    private Currency currency;

    public Product(int id, String name, ProductCategory category, double price, Currency currency) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.currency = currency;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", currency=" + currency +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}