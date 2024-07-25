class MyThread extends Thread {                 
    public void run(){                          
         
        System.out.println(Thread.currentThread().getName());  //main thread working 
        System.out.println("in run");
          
      }

      public void start{            //even if override start and call run its error 
        run();                      //here main thread is work not new thread
      }                             // only Thread class start has tht power to make that new thread work in run
    }


class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

      MyThread obj = new MyThread();     
      obj.start();                        
                                          
      System.out.println(Thread.currentThread().getName());                                    
      
  }
}