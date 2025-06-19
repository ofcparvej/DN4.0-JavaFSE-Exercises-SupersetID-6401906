
public class Test {
    public static void main(String[] args) {
        Computer c1 = new Computer.Builder().setStorage("32 GB").setCPU("CPU1").setRAM("RAM1").build();
        System.out.println(c1);
    }
}
