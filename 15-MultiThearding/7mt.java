class MyThread extends Thread {                 
    public void run(){                          
         
        System.out.println(Thread.currentThread().getName()); 
        System.out.println("in run");
          
      }
    }


class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

      MyThread obj = new MyThread();     
      obj.start();                        //we should not override start method bcz its Thread class method and our start overriden method would not be able to reach run method to give work to thread
                                          //start method inside has Target.run()
     System.out.println(Thread.currentThread().getName());                                    
      
  }
}

//4 complusory things while thread class multithreading
/*
 * 1)extends Thread class
 * 2)donot throws exception in run method 
 * 3)override public void run method
 * 4)donot override start method   (bcz thread class start method only have that power to make that new thread do run method work)
 * 
 * Thread class no argument constructor call parametrized constructor of itself using this();
 */



