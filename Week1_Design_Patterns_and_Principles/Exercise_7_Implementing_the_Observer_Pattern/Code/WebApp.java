public class WebApp implements Observer {
    @Override
    public void update(int price) {
        System.out.println("WebApp :: Stock price updated :" + price);
    }
}
