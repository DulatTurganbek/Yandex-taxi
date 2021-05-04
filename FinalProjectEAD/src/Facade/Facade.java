package Facade;

import Builder.Orderer;
import ChainOfR.*;
import Proxy.Card;
import Proxy.Cash;
import State.Confirmed;
import State.NewOrderr;
import State.Order;

public class Facade {
    NewOrderr initialState = new NewOrderr();
    Order order = new Order(initialState);
    public void customerPrint(){
        Orderer orderer = new Orderer.OrdererBuilder("Dulat","Al-Farabi72","Abaya93","+77789477600").build();
        System.out.println("Orderer name: "+orderer.getName()+ "\nPoint A: "+orderer.getPointA()+"\nPoint B: "+orderer.getPointB()+"\nPhone: "+orderer.getPhoneNumber());
    }

    Taxi Name = new dName();
    Taxi cNumber = new cNumber();
    Taxi phNumber = new phNumber();
    Taxi Class = new tClass();

    public void driverPrint(){
        TaxiInfo driver = new TaxiInfo("Yerasyl","777LLL02","+77778889475","Economy");
        Name.make(driver);
        cNumber.make(driver);
        phNumber.make(driver);
        Class.make(driver);
        order.OrderConfirmed();
        order.Arrived();
        System.out.println("Paying");
        Cash cash = new Cash();
        cash.pay(990);
    }

    public void customer1Print(){
        NewOrderr initialState1 = new NewOrderr();
        Order order1 = new Order(initialState1);
        Orderer orderer1 = new Orderer.OrdererBuilder("Batyr","Abirova5","Manasa95","+77028500996").build();
        System.out.println("Orderer name: "+orderer1.getName()+"\nPoint A: "+orderer1.getPointA()+"\nPoint B: "+orderer1.getPointB()+"\nPhone: "+orderer1.getPhoneNumber());
    }


    public void driver1Print(){
        TaxiInfo driver1 = new TaxiInfo("Yermek","777LLL02","+77777777777","Premium");
        Name.make(driver1);
        cNumber.make(driver1);
        phNumber.make(driver1);
        Class.make(driver1);
        order.OrderConfirmed();
        order.Arrived();
        Card card = new Card();
        card.pay(1500);
    }


}
