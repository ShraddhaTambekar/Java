class Demo{

    void fun(int x){

        return x+10;                          

    }
    public static void main(String []args){

        Demo obj = new Demo();
        System.out.println(obj.fun(10));    //ct error-'void' type not allowed here .....SOP can print return type of only non void function value
        int z = obj.fun(20);                //ct error-incompatible types: void cannot be converted to int
    }
}
