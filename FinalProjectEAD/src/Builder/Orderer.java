package Builder;

public class Orderer {

    private String Name;
    private String pointA;
    private String pointB;
    private String phoneNumber;


    public String getName() {
        return Name;
    }

    public String getPointA() {
        return pointA;
    }

    public String getPointB() {
        return pointB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private Orderer(OrdererBuilder builder) {
        this.Name=builder.Name;
        this.pointA=builder.pointA;
        this.pointB=builder.pointB;
        this.phoneNumber=builder.phoneNumber;
    }

    //Builder Class
    public static class OrdererBuilder{

        // required parameters
        private String Name;
        private String pointA;
        private String pointB;
        private String phoneNumber;


        // optional parameters

        public OrdererBuilder(String Name, String poinA,String pointB,String phoneNumber){
            this.Name=Name;
            this.pointA=poinA;
            this.pointB=pointB;
            this.phoneNumber=phoneNumber;
        }

        public Orderer build(){
            return new Orderer(this);
        }

    }

}

