//arimethatic exception
class Demo{
    void m1(){
        System.out.println("in demo m1");
        System.out.println(10/0);               //exception in m1 stack fram
    }

    void m2(){
        System.out.println("in demo m2");
    }

    public static void main(String []args){
        System.out.println("start main");
        Demo obj = new Demo(); 
        obj.m1();                              //exception came here so jvm will ask void void m1 to handle if not handle by it it will ask m1 caller to handle it (main) but if main also dont handle it then default exception handlaer come in picture
        obj.m2();
        System.out.println("end main");

    }
}

/*output-(run time exception)(show output till its correct then show exception )
 * start main
in demo m1
Exception in thread "main" java.lang.ArithmeticException: / by zero
     at Demo.m1(1ex.java:5)
     at Demo.main(1ex.java:15)
 */
/*
 * Default exception Handler
 * if exception is not handled by anyone then default exception hadler come  
 * 
 * DEH formate
 * 1)Thread name
 * 2)Exception name
 * 3)Description
 * 4) Stack stress
 */