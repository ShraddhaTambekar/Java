class MyThread extends Thread {                 
    public void run(){                        //run is runned in other theard stack  
         
        System.out.println(Thread.currentThread().getName());   

        for(int i = 0;i<10;i++){
          System.out.println("in fun");

          try{                                //as we cannot use throws bcz of exception 
            Thread.sleep(2000);        //therefore we complusory need to use try and catch
          }catch(InterruptedException obj){
            System.out.println("");
          }
          
      }
    }
}

class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

      System.out.println(Thread.currentThread().getName());

      MyThread obj = new MyThread();     //new or born state (is line ko bolte hai)
      obj.start();                       //thread start

      for(int i = 0;i<10;i++){
          System.out.println("in main");
          Thread.sleep(2000);

      }
  }
}

/*
 * output is print according to jvm theard schedular
 */
