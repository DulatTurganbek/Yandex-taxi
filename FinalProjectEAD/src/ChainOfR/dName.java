package ChainOfR;

public class dName extends Taxi {

    @Override
    public void make(TaxiInfo info) {
        System.out.println("Driver name is: "+info.getDriverName());
    }
}
