import java.util.*;
class Demo{

    static void add(){

        int ans = a+b;            //ct error: cannot find symbol....as a,b are visible 
        System.out.println(ans);

    }
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int values");

        int a = sc.nextInt();                  
        int b = sc.nextInt(); 
        
        add();                      

    }
}