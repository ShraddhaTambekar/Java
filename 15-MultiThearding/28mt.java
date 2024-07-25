class MyThread extends Thread{

    public void run(){
          System.out.println(getName());
          System.out.println(Thread.currentThread().getThreadGroup()); 
    }

}

class ThreadGroupDemo{

    public static void main(String []args){

        ThreadGroup pthreadGP = new ThreadGroup("Core2web"); 

        MyThread obj1 = new MyThread();
        System.out.println(obj1.getThreadGroup());   //by default main group

                      
                
    }
}

