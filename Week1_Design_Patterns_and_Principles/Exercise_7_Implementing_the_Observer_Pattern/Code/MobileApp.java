public class MobileApp implements Observer{
    @Override
    public void update(int price) {
        System.out.println("MobileApp :: Stock price updated :" + price);
    }
}
