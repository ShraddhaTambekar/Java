//error ko hum handle ni kr skte usko bus message print kr skte hai
import java.util.*;
class Demo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        try{
            int x = sc.nextInt();
        }catch(RunTimeException | Exception obj){   //or mai kabhi bhi parent class nai likhte usme bus child class exact class likhte hai
            System.out.println("Exception handled");
        }
    }
}
