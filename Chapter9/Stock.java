public class Stock {
    //Create Data fields
    String stockSymbol;
    String Name;
    double previousClosingPrice;
    double CurrentPrice;

    Stock(String newstockSymbol, String newName, double newpreviousClosingPrice, double newCurrentPrice){
          stockSymbol = newstockSymbol;
          Name =  newName;
          previousClosingPrice = newpreviousClosingPrice;
          CurrentPrice = newCurrentPrice;
    }
    double getChangePercent(){
        if(CurrentPrice < previousClosingPrice){
            double temp = previousClosingPrice;
            previousClosingPrice = CurrentPrice;
            CurrentPrice = temp;
        }
        return ((CurrentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}