class Demo extends Thread {                 
    public void run(){                          
         
        System.out.println("Demo" + Thread.currentThread().getName());

        for (int i = 0;i<10;i++){
            System.out.println("In Demo run");
        }
          
      }
}

class MyThread extends Thread {                 
    public void run(){                          
         
        System.out.println("MyThread" + Thread.currentThread().getName());

        Demo obj = new Demo();       //Thread-1   //Theard-0    //Main
        obj.start();
          
      }
}




class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

    System.out.println( "main " + Thread.currentThread().getName());  

    MyThread obj = new MyThread();    //Thread-0   //Main
    obj.start();                        
                                          
                                   
      
  }
}