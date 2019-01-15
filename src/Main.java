


public class Main {
    public static void main(String[] args) {

      //单例模式
      Singleton.getSingleton().print();
      Singleton.getSingleton().setName("李四");
      System.out.println(Singleton.getSingleton().getName());




    }
}
