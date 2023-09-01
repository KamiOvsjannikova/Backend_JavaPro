package Homework_202308_30;

public enum Size {
    Small,
    Medium,
    Large,
    XLarge,
}
class Clothing extends Product {
    private Size size;

    public Clothing(int id, String name, ProductCategory category, double price, Currency currency, Size size) {
        super(id, name, category, price, currency);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}