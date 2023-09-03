package Homework_202308_30;
//1.3. Currency - Перечисление для представления валют для цен товаров:
      //  ??????
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