/*user defined exception    ....used when  throw is used when..protocol is to throw userdefined exception
1)throw                          example bp high and low(bpOversuteException)
*/
import java.util.*;
class Demo{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        
        try{
            if(x==0){                             
                throw new ArithmeticException(); //throw in predefined 
            }
            System.out.println(10/x);

        }catch(ArithmeticException obj){

            System.out.println(obj.toString());
            System.out.println(obj.getMessage());
            System.out.print("Exception in Thread" + Thread.currentThread().getName() + "");
            obj.printStackTrace();

        }
    }
}
