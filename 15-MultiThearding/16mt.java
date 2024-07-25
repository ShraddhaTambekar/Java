class MyThread extends Thread{

    void fun(){

    }

    void gun(){

    }

    public void run(){

    }
}

class ThreadDemo{
    public static void main(String []args){
        MyThread obj = new MyThread();    //thread is created only
        obj.start();     //calls start 0(native)   //thread go to raedy to run and wait when the thread schedular will schedule it
    }                    //even jvm also donot create thread it use 3 rd party library posix thread library
}
