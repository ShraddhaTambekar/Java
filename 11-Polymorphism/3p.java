class Demo{

    void fun(int x){
         System.out.println("hi");
    }

    void fun(float y){
        System.out.println("hi");
    }

    void fun(Demo obj){
        System.out.println("hi");
    }

    public static void main(String []args){
        Demo obj = new Demo();
        obj.fun(10);
        obj.fun(10.5f);
        
        Demo obj1 = new Demo();
        obj1.fun(obj);
    }

}