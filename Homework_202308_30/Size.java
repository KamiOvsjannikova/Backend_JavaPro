package Homework_202308_30;
//1.2. Size - Перечисление для представления размеров одежды:
//??????
public enum Size {
    SMALL ("S"),
    MEDIUM ("M"),
    LARGE ("L"),
    XLARGE ("XL");
    private final String symbol;

    Size(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}


