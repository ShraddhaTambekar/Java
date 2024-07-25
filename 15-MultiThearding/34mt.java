//destroy method
class MyThread extends Thread{   
    
    MyThread(ThreadGroup tg, String str){
        super(tg,str);
    }

    public void run(){
    
          System.out.println(Thread.currentThread()); 
    }

}

class ThreadGroupDemo{

    public static void main(String []args)throws InterruptedException{

     ThreadGroup pThreadGP = new ThreadGroup("India");

     MyThread t1 = new MyThread(pThreadGP,"maha");
     MyThread t2 = new MyThread(pThreadGP,"Goa");
     
     t1.start();
     t2.start();

     ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");
     
     MyThread t3 = new MyThread(cThreadGP,"karachi");
     MyThread t4 = new MyThread(cThreadGP,"Lahore");

     cThreadGP.destroy();       //Illegal thread state exception(deprecated function in version 8 11 )

     Thread.sleep(3000);

     System.out.println(pThreadGP.activeCount());
     System.out.println(pThreadGP.activeGroupCount());

    }
}






