package State;


import State.Order;
import State.States;

public class Arrived implements States {
    public Arrived(){
        System.out.println("Operation completed succesfully :)");
    }

    @Override
    public void NewOrder(Order context) {
        System.out.println("It is no longer possible to add a new order");

    }

    @Override
    public void OrderConfirmed(Order context) {
        System.out.println("Can't confirm order in its current state");

    }

    @Override
    public void Arrived(Order context) {
        System.out.println("The orderer has already arrived to poinB");


    }
}
