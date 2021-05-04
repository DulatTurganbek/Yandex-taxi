package ChainOfR;


public abstract class Taxi{

    private Taxi taxi;



    public void setClient(Taxi taxi) {
        this.taxi = taxi;
    }

    public abstract void make(TaxiInfo info);

}