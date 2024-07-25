class Demo1{

    static {
        System.out.println("in static block1");   //static block is different for different class
    }

}

class Demo2{

    static {
        System.out.println("in static block2");
    }

    public static void main(String []args){
        System.out.println("in main");
        Demo obj = new Demo();                 //as object is made static block executes

    }

    static {
        System.out.println("in static block 3");
    }
}   

