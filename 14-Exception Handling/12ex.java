class FinallyDemo{
    public static void main(String []args)throws InterruptedException{

        for(int i = 0;i<10;i++){

             System.out.println("in loop");
             Thread.sleep(5000);        //throws kiya hai compile time exception
    }
    
  }
}