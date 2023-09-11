public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35 );
        System.out.println("The symbol of stock is " + stock.stockSymbol);
        System.out.println("The name of the stock is " + stock.Name);
        System.out.println("The Percentage Change is " + stock.getChangePercent()+"%");
    }
}