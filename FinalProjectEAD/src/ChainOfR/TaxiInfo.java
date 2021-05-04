package ChainOfR;

public class TaxiInfo  {
    public String driverName;
    public String carNumber;
    public String phoneNumber;
    public String taxiClass;

    public TaxiInfo(String driverName,String carNumber,String phoneNumber,String taxiClass){
        this.driverName = driverName;
        this.carNumber = carNumber;
        this.phoneNumber = phoneNumber;
        this.taxiClass = taxiClass;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTaxiClass() {
        return taxiClass;
    }

    public void setTaxiClass(String taxiClass) {
        this.taxiClass = taxiClass;
    }

    public void doWork(){

    }
}