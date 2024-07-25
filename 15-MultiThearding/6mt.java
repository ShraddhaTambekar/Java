class MyThread extends Thread {                 
    public void run(){                          
         
        System.out.println(Thread.currentThread().getName());   

        for(int i = 0;i<10;i++){
          System.out.println("in fun");

          try{                                 
            Thread.sleep(2000);        
          }catch(InterruptedException obj){
            System.out.println("");
          }
          
      }
    }
}

class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

      System.out.println(Thread.currentThread().getName());

      MyThread obj = new MyThread();     
      obj.start();  
      
      MyThread obj1 = new MyThread();
      obj.start();
      
      

      /*for(int i = 0;i<10;i++){
          System.out.println("in main");
          Thread.sleep(2000);
*/
      }
  }


