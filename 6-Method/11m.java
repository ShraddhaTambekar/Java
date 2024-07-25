import java.util.*;
class Demo{

    void fun(int x,int y){                       

        System.out.println("In fun");

    }
    public static void main(String []args){

        System.out.println("Start Main");
        Demo obj = new Demo();
        obj.fun();                          //ct error   required: int,int,found: no arguments
        System.out.println("End Main");


    }
}


