interface Demo{                            //is we have interface and class chain below it ...100 percent leaving last class other classes are abstract class    
   
    void fun();
    
    void gun();
}
    
abstract class DemoChild implements Demo{    
    
    public void fun(){
            System.out.println("in child fun");
    }    
    
}

class DemoChild1 extends DemoChild{      
    public void gun(){

    }

}

class Client{

    public static void main(String []args){
          
        Demo obj = new DemoChild1();
        obj.fun();
        obj.gun();
        
    }
}
    
    

