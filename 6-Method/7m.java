import java.util.*;
class Demo{

    static void add(int a,int b){ //parameter can be given name different also

        int ans = a+b;            
        System.out.println(ans);  //o-30

    }// after doing work it return to from where it was called that is main
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int values");

        int a = sc.nextInt();             //i-10     
        int b = sc.nextInt();             //i-20
        
        add(a,b);                         //Argument         

    }
}