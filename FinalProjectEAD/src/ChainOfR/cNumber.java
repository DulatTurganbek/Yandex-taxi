package ChainOfR;

public class cNumber extends Taxi {
    @Override
    public void make(TaxiInfo info) {
        System.out.println("Taxi car number is: "+info.getCarNumber());
    }
}
