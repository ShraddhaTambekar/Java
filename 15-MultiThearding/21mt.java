//yeild(main request jvm to yield)yeild is not native method before now its native in 11 version
//join and sleep methods are native methods main donot request the vm to join
//yeild donot have trimmer
//yeild can only be done with theard will same or high priority
//in yeild other thread get cpu for one concurrency time then normal threadschedular jese schedul krta hai vese work krte hai
class MyThread extends Thread{

    public void fun(){
       System.out.println(Thread.currentThread().getName());
       for (int i = 0;i<10;i++){
        System.out.println("in theard0");
       }
    }
}

class ThreadDemo{
  public static void main(String []args)throws InterruptedException{

      MyThread obj = new MyThread();
      obj.start();

      obj.yield();            //main request yeild to jvm but request may or may not be accepted bcz yeild see priority if next thread priority is same or high then only it work
  
      for(int i = 0;i<20;i++){
          System.out.println("in main");
      }

  }
}
