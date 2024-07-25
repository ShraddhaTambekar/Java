interface Demo{                         
   
    void fun();
    
    void gun();
}
    
abstract class DemoChild implements Demo{    
    
    public void fun(){
            System.out.println("in child fun");
    }
    
    
}

class DemoChild1 extends DemoChild{      //DemoChild1 should give body to gun method or it should make itself abstract

}

class Client{

    public static void main(String []args){
          
        
    }
}
    
    
