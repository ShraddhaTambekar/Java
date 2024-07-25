//protocol is when we create new thread we should not use its default name rather we should change its name at time of birth
//MyThread obj = new MyThread("xyz"); and write the parametrized constructor for MyThread class and write super and pass (xyz) parameter then only it will go to thread clasa
class MyThread extends Thread{

    MyThread(String str){
             super("xyz"); //by default is super but super without parameter ...we need to give string parameter to super 
    }

    public void run(){
          System.out.println(getName());
          System.out.println(Thread.currentThread().getThreadGroup()); 
    }

}

class ThreadGroupDemo{

    public static void main(String []args){

        MyThread obj = new MyThread("xyz");
        obj.start();

        System.out.println(Thread.currentThread().getThreadGroup());
        
    }
}