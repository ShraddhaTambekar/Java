interface Demo{                         
   
    void fun();
    
    void gun();
}
    
class DemoChild implements Demo{    
    
    public void fun(){
            System.out.println("in child fun");
    }
    
    public void gun(){
            System.out.println("in child gun");
    }
    
}

class Client{

    public static void main(String []args){

        Demo obj = new DemoChild();
        obj.fun();
        obj.gun();
    }
}
    
    