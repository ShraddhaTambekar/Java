//as we used join that is parameterized we avoid deadloack
//try this code


class MyThread extends Thread{

    static Thread nmMain = null;       

    public void fun(){


        for(int i = 0;i<10;i++){
          System.out.println("in thread");
         }
    }
}

class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

    MyThread.nmMain =  Thread.currentThread();

      MyThread obj = new MyThread();
      obj.start();

      obj.join(50);   
  
      for(int i = 0;i<20;i++){
          System.out.println("in main");
      }

  }
}
