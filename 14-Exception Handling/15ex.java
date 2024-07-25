class Demo{
    public static void main(String []args){

        for(int i = 0;i<10;i++){

            System.out.println("in loop");      

            try{
                 Thread.sleep(5000);

            }catch(RuntimeException obj){          //checked exception cannot be written vinakarn but unchecked can be written bcz they are going to come at run time
                                                   
                 
                 
            }catch(InterruptedException obj1){



            }  
    }
  }
}