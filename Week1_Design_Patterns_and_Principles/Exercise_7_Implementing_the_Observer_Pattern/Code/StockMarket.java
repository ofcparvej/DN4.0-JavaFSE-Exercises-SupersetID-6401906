import java.util.*;

public class StockMarket implements IStock {

    private List<Observer> observers = new ArrayList<>();
    private int stockPrice;

    public void setStockPrice(int price){
        this.stockPrice = price;
        Notify();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
        System.out.println("Total Observers after registration :: " + observers.size() );
    }

    @Override
    public void deregister(Observer o) {
        observers.remove(o);
        System.out.println("Total Observers after De-registration :: " + observers.size() );
    }

    @Override
    public void Notify() {
        for(Observer o:observers){
            o.update(stockPrice);
        }
    }
}
