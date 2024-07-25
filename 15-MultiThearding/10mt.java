//multiThreading using runnable interface(more beneficial we get extra power)
class MyThread implements Runnable{        

    public void run(){
        System.out.println("in run");
    }

}

class ThreadDemo{

    public static void main(String []args){

        MyThread obj = new MyThread();
        obj.start();                      //error bcz start method is of thread class
    }

}
