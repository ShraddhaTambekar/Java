//protocol in company thread name should not be kept thread 0 it should be change we can change it with main but if main become late to set its name then it not good therefor we pass parameter to Mythread class obj
class MyThread extends Thread{

    public void run(){
          System.out.println(getName());
          System.out.println(Thread.currentThread().getThreadGroup()); 
    }

}

class ThreadGroupDemo{

    public static void main(String []args)throws InterruptedException{

        MyThread obj = new MyThread();
        obj.start();

        Thread.sleep(200); //here sleep calls due to which thread main is late to set the name of other thread

        System.out.println(Thread.currentThread().getThreadGroup());
        obj.setName("xyz"); //here main Thread change name of Thread 0
    }
}