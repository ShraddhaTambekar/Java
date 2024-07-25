//we need Thread class to make thread and start it 
// but Thread pull means already made pull of thread() we just need to give how many threads we want and their work
//in thread pull we donot use thread class ....we use Threadpull class method exeute whose parameter is runnable
class MyThread extends Thread{   
    
    MyThread(ThreadGroup tg, String str){
        super(tg,str);
    }

    public void run(){
    
          System.out.println(Thread.currentThread()); 
    }

}

class ThreadGroupDemo{

    public static void main(String []args){

     ThreadGroup pThreadGP = new ThreadGroup("India");

     MyThread t1 = new MyThread(pThreadGP,"maha");
     MyThread t2 = new MyThread(pThreadGP,"Goa");
     
     t1.start();
     t2.start();

     ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"Pakistan");
     
     MyThread t3 = new MyThread(cThreadGP,"karachi");
     MyThread t4 = new MyThread(cThreadGP,"Lahore");

     System.out.println(pThreadGP.activeCount());//tells how many thread are active  in this thread(Active means thread in reday to run state or sleep state or running state)
     System.out.println(pThreadGP.activeGroupCount()); //tells how many threadgroup are active in this thread
     


    }
}






