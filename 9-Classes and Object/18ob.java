class Demo{              

    int x = 10;     
                                          
    Demo(){
        System.out.println("Constructor");
        System.out.println(z);              //even if instance block merges in constructor variables of is not visible in other scope
    }

    {
        System.out.println("instance block2");
        int z = 20;
    }

    {
        System.out.println("instance block1");
    }

    public static void main(String []args){

        Demo obj = new Demo();
        System.out.println("main");

    }
}



