interface Demo{        

    int x = 10;   //interface ke andar ke variable ko memory stack frame mai milti hai 
    void fun();   //vo bhi usi stack frame mai jaha usko access krte hai
}
class DemoChild implements Demo{

    public void fun(){
    System.out.println(x); //......bipush is done here x gets memory in this stack frame variable x is inherited in DemoChild
    System.out.println(Demo.x);
    }
}

class Client{
    public static void main(String []args){
        Demo obj = new DemoChild();
        obj.fun();
    }
}