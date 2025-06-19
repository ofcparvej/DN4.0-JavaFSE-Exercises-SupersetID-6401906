public class Computer {
    final private String Storage;
    final private String CPU;
    final private String RAM;

    private Computer(Builder b){
        this.Storage = b.Storage;
        this.CPU = b.CPU;
        this.RAM = b.RAM;
    }

    public static class Builder{
        private String Storage;
        private String CPU;
        private String RAM;

        public Builder setStorage(String s){
            this.Storage = s;
            return this;
        }
        public Builder setCPU(String s){
            this.CPU = s;
            return this;
        }
        public Builder setRAM(String s){
            this.RAM = s;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString(){
        return "Computer - \n" + "Storage :: " + this.Storage + "\n" + "CPU :: " + this.CPU + "\n" + "RAM :: " + RAM +  "\n";
    }


}
