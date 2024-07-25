class MyThread extends Thread{

    public void run(){
          System.out.println(getName());
          System.out.println(Thread.currentThread().getThreadGroup()); 
    }

}

class ThreadGroupDemo{

    public static void main(String []args){

        ThreadGroup pthreadGP = new ThreadGroup("Core2web"); //created threadgroup named core2web
        System.out.println(pthreadGP.getName());              
                
    }
}
