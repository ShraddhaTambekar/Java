class Demo{

    void fun(int x){                      //Function header-return value,function name,function parameter             
        System.out.println("in fun");   //Funvtion body...only function parameter is optional
        System.out.println(x);            
    }

    public static void main(String []args){

       Demo obj = new Demo();             
       obj.fun(10);                               

    }

}


