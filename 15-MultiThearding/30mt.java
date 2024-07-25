class MyThread extends Thread{

    MyThread(ThreadGroup tg,String str){   //see
        super(tg,str);             
    }                          

    public void run(){
    
          System.out.println(Thread.currentThread()); 
    }

}

class ThreadGroupDemo{

    public static void main(String []args){

        ThreadGroup pthreadGP = new ThreadGroup("Core2web"); 

        MyThread obj1 = new MyThread(pthreadGP,"c,cpp,dsa");
        MyThread obj2 = new MyThread(pthreadGP,"java,dsa");
        MyThread obj3 = new MyThread(pthreadGP,"puthon, ML");   
        
        obj1.start();
        obj2.start();
        obj3.start();
                
    }
}





