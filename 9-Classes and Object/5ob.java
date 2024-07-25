class StaticDemo{

    static int x = 10;       //Static variables are stored in static block
    static int y = 20;       //diagram

    static void disp(){
        
        System.out.println(x);
        System.out.println(y);

    }
}

class Client{
    public static void main(String []args){    //Only method area and java stack is used no object made so no constructor
        System.out.println(StaticDemo.x);
        System.out.println(StaticDemo.y);

        StaticDemo.disp();
    }
}