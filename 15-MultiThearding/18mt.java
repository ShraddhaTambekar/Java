////in java 19 version 
/*when we print t ---->Thread[#value] */
/*
 * 1)sleep
 * 2)join....being nice
 * 3)yeild
 */
//Join method(it is told when even we use join use parameter join not normal join to avoid deadloack)
//garbage collector is called as demon thread(least priority)
class MyThread extends Thread{
      public void fun(){
           for(int i = 0;i<10;i++){
            System.out.println("in thread");
           }
      }
}

class ThreadDemo{
    public static void main(String []args)throws InterruptedException{

        MyThread obj = new MyThread();
        obj.start();

        obj.join();    //join also throws interrupted exception bcz humne khudse kisi thread ka kam rukaya hai
    
        for(int i = 0;i<20;i++){
            System.out.println("in main");
        }

    }
}