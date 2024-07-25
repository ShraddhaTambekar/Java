//yeh topic ke code 8 11 17 19 version pe run krke dekho sare
//more thread more stack ...heap method area and other stuff remain same
/*multithearding is done by2 ways //make diagram
 * 1)extends Theard class.....Theard class parent is object class and implement runnable interface 
 * 2)implement Runnable interface....interface class parent is not object class it donot even have constructor
 

 */

class ThreadDemo{                                      //1 thread we get sequenced output according to flow

    static void fun()throws InterruptedException{
        for(int i = 0;i<20;i++){
            System.out.println(i);

            try{
            Thread.sleep(3000);
            }catch(InterruptedException obj){
                
            }
        }           
    }
    public static void main(String []args)throws InterruptedException{
        for(int i = 0;i<10;i++){
              System.out.println(i);
              Thread.sleep(2000);   //1000 milisecond = 1 sec
        }
        fun();      
    }
}

