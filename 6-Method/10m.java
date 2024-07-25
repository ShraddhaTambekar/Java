import java.util.*;
class Demo{

    void fun(){                       

        System.out.println("In fun");

    }
    public static void main(String []args){

        System.out.println("Start Main");
        Demo obj = new Demo();
        obj.fun(10);                          //ct error required: no arguments,found: int
        System.out.println("End Main");


    }
}

