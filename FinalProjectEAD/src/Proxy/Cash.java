package Proxy;

public class Cash implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Payed "+amount+"tg cash");
    }
}
