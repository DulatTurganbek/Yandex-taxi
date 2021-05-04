package Proxy;

public class Card implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Payed "+amount+" tg by card");
    }
}
