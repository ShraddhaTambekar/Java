class Demo{

    void fun(int x){
        System.out.println("in para");
    }

    void fun(float ch){
        System.out.println("char para");
    }

}

class Client{
    public static void main(String []args){
        Demo obj = new Demo();
        obj.fun('A');        //in para          //1st exact match is seen if not found more byte datatype is seen  
        obj.fun(10.5);       //error bcz  its double 8 byte not same match not even more than that found    
    }
}

