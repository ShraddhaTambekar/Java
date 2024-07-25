//multithearding by extending Thread class
class MyThread extends Thread {                 //output is unpredictable
      public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("in fun");
        }
      }
}

class ThreadDemo{
    public static void main(String []args){

        MyThread obj = new MyThread();  
        obj.start();

        for(int i = 0;i<10;i++){
            System.out.println("in main");
        }
    }
}
/*
 After making object of MyTheard class its constructor is called then Thread class constructor is called , in that constructor VMTheard.create method is called
 means new thread is born 
 why do we extends theard class bcz theard class has power to create theard
 main theard name is main theard new theard name is Thread0(bydefault name)...we can change it with method of theard class setName()
 as MyTheard is now child of Theard class we can access its method start() and start the thread

 */