class Demo{          //finally is used to close connection if any exception occur and not catched it will go to DEH but visite finally block complusory 
    void m1(){

    }

    void m2(){

    }
    public static void main(String []args){

            Demo obj = new Demo();
            obj.m1();   
            obj = null;
            try{
                 obj.m2();

            }catch(NullPointerException obj1){          
                                                   
               System.out.println("exception");  
                 
            }finally{
                
                System.out.println("connection closed"); //whether exception ocuur or not exception will come
 
            }
            System.out.println("end main");
        }
        
    }
} 