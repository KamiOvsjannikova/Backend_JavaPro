package Homework_202308_30;
public enum Currency {
    EUR ("$"),
    USD ("€"),
    GBP ("£"),
    INR ("₹");

    private final String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
