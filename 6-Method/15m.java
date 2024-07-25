class Demo{

    int fun(int x){

        return x+10;                          //Return value can be written in 2 ways- 1)SOP print 2)storing 

    }
    public static void main(String []args){

        Demo obj = new Demo();
        System.out.println(obj.fun(10));    //Return value printed using SOP
        int z = obj.fun(20);                //Return value stored using variable
    }
}
