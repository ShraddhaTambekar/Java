class Demo{

    void fun(int x){
        System.out.println("in para");
    }

    void fun(char ch){
        System.out.println("char para");
    }

}

class Client{
    public static void main(String []args){
        Demo obj = new Demo();
        obj.fun('A');                    //it will go to char parameter fun
    }
}
