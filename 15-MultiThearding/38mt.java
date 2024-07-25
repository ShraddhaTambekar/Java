//executors
import java.util.concurrent.*;
class MyThread implements Runnable{
    int num;
    MyThread(int num){
        this.num = num;
    }

    public void run(){
        System.out.println(Thread.currentThread() + "Start Thread: " + num); //executors class Thread.currentThread work different that Thread class method
        dailyTask();
        System.out.println(Thread.currentThread() + "End Thread: " + num); //here Threadpoolnumber and thread number
    }

    void dailyTask(){              //business logic is written here means jo bhi task hoga

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
            ser.execute(obj);  //runnable obj
       }
    }
}

//output-
/*
 Thread[pool-1-thread-2,5,main]Start Thread: 1
Thread[pool-1-thread-3,5,main]Start Thread: 2
Thread[pool-1-thread-1,5,main]Start Thread: 0
Thread[pool-1-thread-1,5,main]End Thread: 0
Thread[pool-1-thread-2,5,main]End Thread: 1
Thread[pool-1-thread-3,5,main]End Thread: 2
Thread[pool-1-thread-2,5,main]Start Thread: 4
Thread[pool-1-thread-1,5,main]Start Thread: 3
Thread[pool-1-thread-3,5,main]Start Thread: 5
Thread[pool-1-thread-2,5,main]End Thread: 4
Thread[pool-1-thread-3,5,main]End Thread: 5
Thread[pool-1-thread-1,5,main]End Thread: 3

 */
