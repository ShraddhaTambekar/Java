class Demo{

    int x = 10;         
    private int y = 20;

    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
}

class MainDemo{
    public static void main(String []args){

        Demo obj = new Demo();
        obj.fun();
        System.out.println(obj.x);    
        System.out.println(obj.y);          //ct error: y has private access in Demo
        
        System.out.println(x);              //ct error: cannot find symbol
        System.out.println(y);              //ct error: cannot find symbol
    }
}
