//ser.shutDown........shutdown the server
import java.util.concurrent.*;
class MyThread implements Runnable{
    int num;
    MyThread(int num){
        this.num = num;
    }

    public void run(){
        System.out.println(Thread.currentThread() + "Start Thread: " + num);
        dailyTask();
        System.out.println(Thread.currentThread() + "End Thread: " + num); 
    }

    void dailyTask(){              

        try{

            Thread.sleep(3000);

        }catch(InterruptedException obj){            

        }
    }
}

class ThreadPoolDemo{
    public static void main(String []args){
       ExecutorService ser = Executors.newFixedThreadPool(3);

       for(int i = 0;i<6;i++){
            MyThread obj = new MyThread(i);
            ser.execute(obj);  
            ser.shutdown();     //server band thread gone

       }
    }
}