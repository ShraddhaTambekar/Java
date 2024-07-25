class MyThread extends Thread{          //changing name of threads

    public void run(){
        System.out.println("in run");
        System.out.println(Thread.currentThread());
    }

}

class ThreadDemo{

    public static void main(String []args)throws InterruptedException{

        System.out.println(Thread.currentThread());

        MyThread obj = new MyThread();  
        obj.start();  
        Thread.sleep(100); 
        Thread.currentThread().setName("Core2web");   //  changed main thread name bcz thread0 is started and has gone to do work
        System.out.println(Thread.currentThread());           
       
    }

}
//in java 19 version 
/*when we print t ---->Thread[#value] */
/*
 * 1)sleep
 * 2)join....being nice
 * 3)yeild
 */