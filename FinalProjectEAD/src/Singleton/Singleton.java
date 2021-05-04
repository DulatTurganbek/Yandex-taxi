package Singleton;

public class Singleton {

    private static Singleton yandexTaxi = new Singleton();

    private  Singleton(){}

    public static Singleton getYandexTaxi() {
        return yandexTaxi;
    }
    public void print(){ System.out.println("This is Yandex taxi's application"); }
}