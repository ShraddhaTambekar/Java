class Demo{
    
    int x = 10;
    static int y = 10;
   
    void fun(){                                
        System.out.println("In fun Method");
    }

    static void gun(){
        System.out.println("In gun method");
    }

    public static void main(String []args){

       Demo obj = new Demo();              //Non Static methods and variables are accesed in static method using object of class
       obj.fun();
       gun();
       obj.gun();                          //Even we can access static method using object

       System.out.println(obj.x);
       System.out.println(y);
       System.out.println(obj.y);         //Even we can access static method using object

    }

}
