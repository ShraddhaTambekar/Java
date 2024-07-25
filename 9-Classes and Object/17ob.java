class Demo{              

    int x = 10;     
                                          
    Demo(){
        System.out.println("Constructor");
    }

    {
        System.out.println("instance block2"); //2 instance block in same class merge together
    }                                            //instance block is merged in constructor only (1st variable get assigened then instance block thing then constructor thng)

    {
        System.out.println("instance block1");
    }

    public static void main(String []args){

        Demo obj = new Demo();
        System.out.println("main");

    }
}

