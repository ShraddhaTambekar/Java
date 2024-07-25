interface Demo{        

    int x = 10;   
    void fun();   
}
class DemoChild implements Demo{

    public void fun(){
    System.out.println(x);    //bipush 10....memory ek line pehle milti hai
    System.out.println(x);    //bipush 10....jitni bar access krte hai utni bar bipush hoga even ek scope mai vi 
    System.out.println(Demo.x);
    }
}

class Client{
    public static void main(String []args){
        Demo obj = new DemoChild();
        obj.fun();
    }
}