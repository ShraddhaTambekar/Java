class Demo{

    void fun(int x){                                 
        System.out.println("in fun");   
        System.out.println(x);            
    }

    public static void main(String []args){

       Demo obj = new Demo();             
       obj.fun(10.5f);             //ct error: incompatible types: possible lossy conversion from float to int                         

    }

}


