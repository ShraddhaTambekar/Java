class Demo{
    public static void main(String []args){

        for(int i = 0;i<10;i++){

            System.out.println("in loop");

            try{
                 Thread.sleep(5000);

            }catch(IOException obj){ //dont write exception which will never come(compiler che compile time exception)
                                    //also donot write (object obj) in catch bcz throwable is root class of exception till then we write  
            }  
    }
  }
}