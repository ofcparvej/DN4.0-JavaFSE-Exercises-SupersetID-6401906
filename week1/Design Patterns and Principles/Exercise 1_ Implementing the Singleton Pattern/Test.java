
public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Logger 1");
        logger2.log("Logger 2");

        // is same instance ?
        if(logger1==logger2){
            System.out.println("Only One instance of Logger");
            System.out.println("logger1 hashCode : " + logger1.hashCode());
            System.out.println("logger2 hashCode : " + logger2.hashCode());
        }else{
            System.out.println("Multiple Instances of logger");
        }
    }
}
