class Demo{
    public static void main(String []args){

        for(int i = 0;i<10;i++){

            System.out.println("in loop");

            try{
                 Thread.sleep(5000);

            }catch(RuntimeException obj){          //compiler isko error ni deta bcz compiler only check compile time exception run time mai ah sakta ha run time exception isiliye vo isko error nai deta
                                                   //runtimeexception are given by jvm
                 
                 
            }catch(InterruptedException obj1){



            }  
    }
  }
}
