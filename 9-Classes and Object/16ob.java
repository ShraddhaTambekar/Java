class Demo{              

    int x = 10;     
                                          //object then instance block then constructor
    Demo(){
        System.out.println("Constructor");
    }

    {
        System.out.println("instance block");
    }
    public static void main(String []args){

        Demo obj = new Demo();
        System.out.println("main");

    }
}
