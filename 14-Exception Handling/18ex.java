//error ko hum handle ni kr skte usko bus message print kr skte hai
import java.util.*;
class Demo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        try{
            int x = sc.nextInt();
        }catch(NullPointerException | ArithematicException obj){  //try krp isme
            System.out.println("Exception handled");
        }
    }
}
