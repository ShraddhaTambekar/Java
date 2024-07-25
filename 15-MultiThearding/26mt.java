class MyThread extends Thread{

    MyThread(){                 //writing no arument constructor
        
    }

    MyThread(String str){
             super(str);  
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

        MyThread obj1 = new MyThread("pqr");
        obj.start();

        MyThread obj2 = new MyThread();   
        obj2.start();                    
                
    }
}
