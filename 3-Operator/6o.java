class Demo{
    public static void main(String [] args){
        
        int x = 10;
        int y = 20;
                                   
        if(x)                           //ct error: incompatible types: int cannot be converted to boolean
           System.out.println("hi");  //numbers are not consider as true or false
        else
           System.out.println("hello");   
    

    }
}
