import java.util.*;
class Demo{

    void fun(int x){                       

        System.out.println(x);

    }
    public static void main(String []args){

        System.out.println("Start Main");
        Demo obj = new Demo();
        obj.fun();                          //ct  required: int,found: no arguments....error is with respect to parameter
        System.out.println("End Main");


    }
}
