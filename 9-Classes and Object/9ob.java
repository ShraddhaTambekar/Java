class Demo{
    
    static int x = 10;                       //variable get memory only when its stack is pushed in java stack

    static {                                //Before main, static block come and initialise it by pushing it in java stack then pop then main stack in pushed
        System.out.println("static block");  //see bytecode
        System.out.println(x);
    }

    public static void main(String []args){
        System.out.println("in main");
    }

}
