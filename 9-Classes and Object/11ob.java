class Demo{
    
    static int x = 10;                     

    static {                                
        System.out.println("static block");  
        System.exit(0);               //System.exit means exit code without meeting main method
    }

    public static void main(String []args){
        System.out.println("in main");
    }

}
