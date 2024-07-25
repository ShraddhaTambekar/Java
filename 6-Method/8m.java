import java.util.*;
class Demo{

    void fun(int x){                       //After main stack is pushed in java stack , then fun is called fun stack is pushed

        System.out.println(x);

    }
    public static void main(String []args){

        Demo obj = new Demo();
        obj.fun(10);                      

    }
}
