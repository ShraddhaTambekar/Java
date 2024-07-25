interface Demo{        

    int x = 10;   
    void fun();   
}
class DemoChild implements Demo{

    int y = x; //x is value here...we know bipush ek line pehle hota hai therefore constructor ke andar milegi (class ke instance variable constructorke andar hotahai)

    public void fun(){
    System.out.println(x);   //x is reference here
    System.out.println(x);   
    System.out.println(Demo.x);
    }
}

class Client{
    public static void main(String []args){
        Demo obj = new DemoChild();
        obj.fun();
    }
}
