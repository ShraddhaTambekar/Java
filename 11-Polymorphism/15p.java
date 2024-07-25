class Demo{

    void fun(int x,float y){                 // both have different method signature still complier get confused whom to give the argument therefore ambigouity
        System.out.println("in para");
    }

   /* void fun(float x, int y){
        System.out.println("char para");
    }*/

}

class Client{
    public static void main(String []args){
        Demo obj = new Demo();
        obj.fun(10,10);                   //ct error: reference to fun is ambiguous             
    }
}
