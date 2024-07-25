interface Demo{      

    static void fun(){                    
        System.out.println("Demo1-m1");
      }
}

class DemoChild implements Demo{  
    
}

class Client{
    public static void main(String []args){

       Demo obj = new DemoChild();
       obj.fun();                     //interface static donot come done  complusory to call by interface name        
    }
}



