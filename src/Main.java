import abstractFactory.AbstractPerson;
import abstractFactory.ChinaProductPersonFactory;
import abstractFactory.EnglandProductPersonFactory;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        //单例模式
        Singleton.getSingleton().print();
        Singleton.getSingleton().setName("李四");
        System.out.println(Singleton.getSingleton().getName());

        //抽象工厂模式
        ChinaProductPersonFactory chinaProductPersonFactory = new ChinaProductPersonFactory();
        EnglandProductPersonFactory englandProductPersonFactory = new EnglandProductPersonFactory();

        AbstractPerson chinaPerson = chinaProductPersonFactory.product();
        AbstractPerson englandPerson = englandProductPersonFactory.product();

        chinaPerson.eat();
        englandPerson.eat();


    }
}
