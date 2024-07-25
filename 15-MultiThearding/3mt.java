class MyThread extends Thread {                
    public void run()throws InterruptedException{        //new concept in overriding (when we override a method and if the parent class method donot throws any Exception then child clss method should also not throws Exception)
      for(int i = 0;i<10;i++){
          System.out.println("in fun");
          Theard.sleep(1000);                       
      }
    }
}

class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

      MyThread obj = new MyThread();  
      obj.start();

      for(int i = 0;i<10;i++){
          System.out.println("in main");
      }
  }
}
/*
 * Theard class has run method which is complusory needed to be overriden to do multithearding and it should also not throws exception as Theard class run also donot throws exception
 * run method body is the work that we want the new theard to do
 */
