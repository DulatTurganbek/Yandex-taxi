package ChainOfR;

public class phNumber extends Taxi{
    @Override
    public void make(TaxiInfo info) {
        System.out.println("Taxi driver's phone number: "+info.getPhoneNumber());
    }
}