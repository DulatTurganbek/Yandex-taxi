package ChainOfR;

public class tClass extends Taxi {
    @Override
    public void make(TaxiInfo info) {
        System.out.println("Taxi class is: "+info.getTaxiClass());
    }
}
