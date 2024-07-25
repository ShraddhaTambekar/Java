class MyThread extends Thread{                 
    public void run(){   
                               
        Thread t = Thread.currentThread();  
        System.out.println(t.getName());
        
          
      }
}



class ThreadDemo{
  public static void main(String []args){                       
                                          
      Thread t = Thread.currentThread();  
      System.out.println(t.getName());                          
      
      MyThread obj1 = new MyThread();
      obj1.start();

      obj1.start(); //we cannot start again the thread        /*Exception in thread "main" Thread-0
                                          //                       java.lang.IllegalThreadStateException
                                                              //         at java.base/java.lang.Thread.start(Thread.java:789)
                                                              //         at ThreadDemo.main(15mt.java:22) */

    }
}
