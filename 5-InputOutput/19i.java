import java.util.*;
class Demo1{                               //StringTokenizer in Scanner
    public static void main(String []args){

        Scanner obj = new Scanner(System.in); 

        System.out.println("Enter playerinfo :");
        String info = obj.nextLine();          //i-Shree 1 30.00 //imp to use nextLine method as next method read only 1 string

        StringTokenizer st = new StringTokenizer(info," ");   //exception doubt of no such element found

        String token1 = st.nextToken();
        String token2 = st.nextToken();
        String token3 = st.nextToken();

        String name = token1;
        int jerNo =Integer.parseInt(token2);
        float avg = Float.parseFloat(token3);   

        System.out.println("Name is:" + name);   //o-Shree
        System.out.println("jerNo is:" + jerNo); //o-1
        System.out.println("Avg is:" + avg);     //o-30.00

    }
}
