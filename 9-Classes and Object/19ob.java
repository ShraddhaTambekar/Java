class Demo{
    int x = 10;
    static int y = 20;

    Demo(){
        System.out.println("in constructor");
    }

    {
        System.out.println("in instance block1");
    }

    static {
        System.out.println("in static block1");
    }

    public static void main(String []args){
        System.out.println("in main");
        Demo obj = new Demo();
    }

    static {
        System.out.println("in static block2");
    }

    {
        System.out.println("in instance block2");
    }

}
/*\
 in static block 1
 in static block 2
 in main
 in instance block 1
 in instance block 2
 in constructor

 */
