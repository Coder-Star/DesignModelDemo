package singleton;

//单例模式
public class Singleton {
   //单例方法以及属性
   public void  print(){
      System.out.println("单例模式");
   }

   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }


   //构造方法私有，避免其他类调用 公共部分 必须部分
   private Singleton(){

   }

   // 线程安全，效率较高
   private static Singleton singleton;
   public static Singleton getSingleton(){
         if (singleton == null){
            synchronized (Singleton.class){
               if (singleton == null){
                  singleton = new Singleton();
               }
            }
      }
      return singleton;
   }

   // 饿汉式 线程安全 效率低
   private static final Singleton singletonOne = new Singleton();
   public static Singleton getSingletonOne(){
      return singletonOne;
   }



   // 饱汉式 线程不安全 效率高
   private static  Singleton singletonTwo;
   public static Singleton getSingletonTwo(){
      if (singletonTwo == null) {
         singletonTwo = new Singleton();
      }
      return singletonTwo;
   }

   // 线程安全，效率低
   private static  Singleton singletonThree;
   public static synchronized Singleton getSingletonThree(){
      if (singletonThree == null) {
         singletonThree = new Singleton();
      }
      return singletonThree;
   }



}

