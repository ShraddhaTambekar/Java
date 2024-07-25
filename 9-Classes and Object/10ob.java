class Demo{
    
    static int x = 10;

    static {                                //in case of multiple static block it will print according to sequence
        System.out.println("static block1");  //both static block merges
        }

    public static void main(String []args){
        System.out.println("in main");
    }

    static {         
                             
        System.out.println("static block2");  
    }

}

