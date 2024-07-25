class Demo{
    
    void fun(Object obj){
        System.out.println("object ");
    }

    void fun(String str1){              
        System.out.println("String");
    }
}

class Client{
    public static void main(String []args){

        Demo obj = new Demo();
        obj.fun("Core2web"); //match both but do to string bcz exact match
        obj.fun(new StringBuffer("Core2web"));   //only match to object class
        obj.fun(null);      //match to both but child is given property        



        
    }
}


