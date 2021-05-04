import Facade.Facade;
import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton printer = Singleton.getYandexTaxi();
        printer.print();
        System.out.println("");
        Facade client = new Facade();
        client.customerPrint();
        System.out.println(" ");
        client.driverPrint();
        System.out.println(" ");
        System.out.println(" ");
        client.customer1Print();
        System.out.println(" ");
        client.driver1Print();


    }
}
