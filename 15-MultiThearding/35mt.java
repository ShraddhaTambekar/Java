//ThreadGroup interrupt method
class MyThread extends Thread{   
    
    MyThread(ThreadGroup tg, String str){
        super(tg,str);
    }

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

     MyThread t1 = new MyThread(pThreadGP,"maha");
     MyThread t2 = new MyThread(pThreadGP,"Goa");
     
     t1.start();
     t2.start();

     ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");
     
     MyThread t3 = new MyThread(cThreadGP,"karachi");
     MyThread t4 = new MyThread(cThreadGP,"Lahore");

     cThreadGP.interrupt(); //Threadgroup intruppt method (pinning the pakistan grp)(means we integrrupt a grp,when thread are in sleep state of a grp and we interrupt it than this come)

     System.out.println(pThreadGP.activeCount());
     System.out.println(pThreadGP.activeGroupCount());

    }
}







