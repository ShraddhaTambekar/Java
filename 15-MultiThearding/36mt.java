//ThreadGroup interrupt with runnable interface************
class MyThread implements Runnable{   

    public void run(){
    
          System.out.println(Thread.currentThread()); 

          try{
            Thread.sleep(100);
          }catch(InterruptedException ie){
            System.out.println(ie.toString());
          }
    }

}

class ThreadGroupDemo{

    public static void main(String []args)throws InterruptedException{

     ThreadGroup pThreadGP = new ThreadGroup("India");

     MyThread obj1 = new MyThread();    //Runnable type
     MyThread obj2 = new MyThread();

     Thread t1 = new Thread(pThreadGP,obj1,"Maha"); //thread class have constructor also have 3 parameter constructor
     Thread t2 = new Thread(pThreadGP,obj1,"Goa");  //this type of constructor is used when we use both runnable and thread class

     
     t1.start();
     t2.start();

     ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");
     
     MyThread obj3 = new MyThread();
     MyThread obj4 = new MyThread();

     Thread t3 = new Thread(cThreadGP,obj3,"karachi");
     Thread t4 = new Thread(cThreadGP,obj3,"Lahore");

     t3.start();
     t4.start();

     System.out.println(pThreadGP.activeCount()); 
     System.out.println(pThreadGP.activeGroupCount());//vese dekhe toh 3 group hai but parent thread group se perspective se 1 hee grp hai

    }
}







