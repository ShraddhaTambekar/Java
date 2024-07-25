class MyThread implements Runnable{         

    public void run(){
        System.out.println("in run");
        System.out.println(Thread.currentThread().getName());
    }

}

class ThreadDemo{

    public static void main(String []args){

        System.out.println(Thread.currentThread().getName());

        MyThread obj = new MyThread();

        Thread obj1 = new Thread(obj);    //calls thread class parameterized constructor (Runnable)
        obj1.start();                   
       
    }

}
/*
 * MyThread implements runnable interface then its of Runnable type (Parent p = new child)(interface reference is allowed)
 * Thread class has 2  constructor 1)normal 2) parameter Runnable(here we use this )
 Runnable way to do multithreading is preferred 
   1)bcz multiple inheritance is not allowed in class so if our class extends thread class then it cannot further take inherite and class therefore runnable is prewffered , it allow u to extend other class too + multithreading
   2)we can use Threadpull...Threadpull execute method parameter Runnable
 */