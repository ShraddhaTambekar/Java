//To make some grp parent of our grp
//here their are 6 new thread other than main
//try methods of child Thread group

class MyThread extends Thread{

    MyThread(ThreadGroup tg,String str){   
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

        ThreadGroup cthreadGP = new ThreadGroup(pthreadGP,"Incubator"); //we want to make Incubator parent of core2web thread group

        MyThread obj4 = new MyThread(pthreadGP,"Flutter");
        MyThread obj5 = new MyThread(pthreadGP,"Reactjs");
        MyThread obj6 = new MyThread(pthreadGP,"Stringboot");

        obj4.start();
        obj5.start();
        obj6.start();
    }
}






