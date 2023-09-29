package Summary_29_09.arrays.oop;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Jogurt", 2.5);

        System.out.println(product1);

        System.out.println("переоценка товаров");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новую цену товара:");
        double newPrice = scanner.nextDouble();

        if (newPrice > 0) {
            product1.setPrice(newPrice);
        } else {
            System.out.println("введенная цена не корретна! Переоценка не проиизведена!");
        }

        System.out.println(product1);


    }
}
