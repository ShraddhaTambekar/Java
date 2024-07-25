class MyThread extends Thread{                 
    public void run(){   
                               
        Thread t = Thread.currentThread();  
        System.out.println(t.getPriority());
        t.setPriority(15); 
          
      }
}



class ThreadDemo{
  public static void main(String []args){                       
                                          
      Thread t = Thread.currentThread();  //object of main
      System.out.println(t.getName());    //main                        
      System.out.println(t);              //Thread[main,5,main] ----->Thread[]
      System.out.println(t.getPriority());//5

      MyThread obj1 = new MyThread();     //this thread priority 5 ......A
      obj1.start();

      t.setPriority(15);      //Exception in thread "main" Thread-0

      MyThread obj2 = new MyThread();     //this thread priority 7 ......A
      obj2.start();

    }
}