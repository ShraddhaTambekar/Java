class Demo{
    
    static int x = 10;

    static {                                
        System.out.println("static block1"); 
        System.out.println(z);                //Even if both static block merge z is not visible due to scope
        }

    public static void main(String []args){
        System.out.println("in main");
    }

    static {         
        int z = 10;                       
        System.out.println("static block2");  
    }

}


