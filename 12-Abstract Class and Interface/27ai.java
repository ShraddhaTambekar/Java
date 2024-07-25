interface Demo{      

    static void fun(){                    
        System.out.println("Demo1-m1");
      }
}

class DemoChild implements Demo{  
    void fun(){                        //ststic interface mai alag hai so yaha void fun child ki apni method hai kyuki static interface mai inherit vese bhi nai hota
        System.out.println("fun");
        Demo.fun();
    }

}

class Client{
    public static void main(String []args){

       DemoChild obj = new DemoChild();
       Demo.fun();    
       obj.fun();                        
    }
}




