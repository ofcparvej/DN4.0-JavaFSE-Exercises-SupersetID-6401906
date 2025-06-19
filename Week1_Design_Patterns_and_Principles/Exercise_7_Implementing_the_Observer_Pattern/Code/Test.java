public class Test {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();   // both have update methods  --> par = child()
        Observer web = new WebApp();



        market.register(mobile);       // [mobile]
        market.register(web);          // [mobile , web]

        market.setStockPrice(100);     // [mobile->100 , web->100]
        market.setStockPrice(120);     // [mobile->120 , web->120]

        market.deregister(web);        //[mobile]
        market.setStockPrice(140);     //[mobile->140]
    }
}
