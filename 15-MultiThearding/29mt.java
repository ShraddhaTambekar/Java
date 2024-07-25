class MyThread extends Thread{

    MyThread(ThreadGroup tg){
        super(tg);            
    }

    public void run(){
          System.out.println(getName());
          System.out.println(Thread.currentThread().getThreadGroup()); 
    }

}

class ThreadGroupDemo{

    public static void main(String []args){

        ThreadGroup pthreadGP = new ThreadGroup("Core2web"); 

        MyThread obj1 = new MyThread(pthreadGP);                     
                
    }
}