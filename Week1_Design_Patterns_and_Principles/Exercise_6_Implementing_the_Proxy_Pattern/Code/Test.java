import Iimage.Image;

public class Test {
    public static void main(String[] args) {
        Image i1 = new ProxyImage("fileA");

        Image i2 = new ProxyImage("fileB");

        i1.display();
        i1.display();

        i2.display();
    }
}
