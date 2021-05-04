package State;

public class Confirmed implements States {
    public Confirmed(){
        System.out.println("Taxi on the way");
    }
    @Override
    public void NewOrder(Order context) {
        System.out.println("New order cannot be accepted");

    }

    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Order is already confirmed and orderer sits in taxi");
    }

    @Override
    public void Arrived(Order context) {
        System.out.println("The orderer is arrived at pointB");
        context.setCurrentState(new Arrived());

    }
}
