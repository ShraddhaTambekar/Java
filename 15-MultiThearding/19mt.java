//Deadlock


class MyThread extends Thread{

    static Thread nmMain = null;         //there is no method to get main thread name here to do jhugad

    public void fun(){
       
        try{

            nmMain.join();

        }catch(InterruptedException obj ){
             
        }

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

      obj.join();   
  
      for(int i = 0;i<20;i++){
          System.out.println("in main");
      }

  }
}