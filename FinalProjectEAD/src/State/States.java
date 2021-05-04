package State;

public interface States {
    void NewOrder(Order context);
    void OrderConfirmed(Order context);
    void Arrived(Order context);

}
