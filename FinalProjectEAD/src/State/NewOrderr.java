package State;

public class NewOrderr implements States {
    public NewOrderr(){
        System.out.println("New order");
    }

    @Override
    public void NewOrder(Order context) {
            System.out.println("To switch to a new order, you must confirm the current order.");
        }


    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Order confirmed and orderer in taxi.");
        context.setCurrentState(new Confirmed());
    }

    @Override
    public void Arrived(Order context) {
        System.out.println("The orderer is arrived at pointB");
    }


}

