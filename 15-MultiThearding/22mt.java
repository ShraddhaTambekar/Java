//protocol sleep method should not be used directly company may team lead se puhke bcz performance slow hota hai
//protocol join ka call without parameter na ho
//Theard group  example chatbot therad grp (main reason to bring thread grp is giving simgle command we can give command to all thread in that grp)
//example when we serach in file
//javap java.lang.ThreadGroup....has Thread destroy method which destroy threads
//threadgroup has 2 constructor 1)string parameter 2)ThreadGroup and String parameter
//getName is in both Theardclass and ThreadGroup class so while printling see whos obj u are using to print it
//getPriority is also method in both classes but theard default prioriity is 5 but ThreadGroup default priority is 10
//once Thread Group is Created theard cannot change its group

class MyThread extends Thread{

    public void run(){
          System.out.println(Thread.currentThread().getThreadGroup()); //main (by default group of theard 0)
          System.out.println(getName()); //Parent class Method //Thread 0
    }

}

class ThreadGroupDemo{

    public static void main(String []args){

        MyThread obj = new MyThread();
        obj.start();

        System.out.println(obj.getName());//Thread 0...

        System.out.println(Thread.currentThread().getThreadGroup());
        
    }
}
