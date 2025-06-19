public interface IStock {
    void register(Observer o);
    void deregister(Observer o);
    void Notify();
}
