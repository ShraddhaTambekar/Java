interface A{        

    int x = 10;   
    
}
interface B{

    int x = 20;
}
class Child implements A,B{
    

    void fun(){
        System.out.println(x);//ambiguity ayegi protocol - while accessing variable of interface use interfacename.variable name
    }
}

class Client {
    public static void main(String []args){
        Child obj = new Child();
        obj.fun();
    }
}