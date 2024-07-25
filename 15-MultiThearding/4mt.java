class MyThread extends Thread {                 //output is unpredictable
    public void run(){                          //overriden method run was public therefore we write public void run here
      for(int i = 0;i<10;i++){
          System.out.println("in fun");
          
      }
    }
}

class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

      MyThread obj = new MyThread();  
      obj.start();

      for(int i = 0;i<10;i++){
          System.out.println("in main");
          Thread.sleep(2000);
      }
  }
}