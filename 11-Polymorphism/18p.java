class Demo{
    
    void fun(String str){
        System.out.println("String ");
    }

    void fun(StringBuffer str1){              
        System.out.println("Stringbuffer");
    }
}

class Client{
    public static void main(String []args){

       // String str1 = null;            //these string are not made bcz they are null
       // StringBuffer sb = null;
        Demo obj = new Demo();
        obj.fun("Core2web"); 
        obj.fun(new StringBuffer("Core2web"));
        obj.fun(null);               //both are allowed in string and stringBuffer therefore ambiguity error



        
    }
}

