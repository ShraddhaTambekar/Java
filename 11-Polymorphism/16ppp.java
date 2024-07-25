class Demo{
    
    void fun(String str){
        System.out.println("String ");
    }

    void fun(StringBuffer str1){              //String buffer need only new made string
        System.out.println("Stringbuffer");
    }
}

class Client{
    public static void main(String []args){
        Demo obj = new Demo();
        obj.fun("Core2web");     //therefore it match to String str parameter
        
    }
}
