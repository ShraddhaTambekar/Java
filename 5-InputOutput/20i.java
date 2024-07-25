import java.util.*;
class Demo{                                /////use while and fix token no.
    public static void main(String []args){

        Scanner obj = new Scanner(System.in); 

        System.out.println("Enter playerinfo :");
        String info = obj.nextLine();

        StringTokenizer st = new StringTokenizer(info, " ");  //exception doubt of nosuch element found
        
        System.out.println(st.countTokens());

      /*  String token1 = st.nextToken();
        String token2 = st.nextToken();
        String token3 = st.nextToken();*/

        while(st.hasMoreTokens()){                            //using hasMoreToken when we dont know how many tokens will come as input
            System.out.println(st.nextToken());
        }

     /*   String name = token1;
        int jerNo =Integer.parseInt(token2);
        float avg = Float.parseFloat(token3);  

        System.out.println("Name is:" + name); 
        System.out.println("jerNo is:" + jerNo); 
        System.out.println("Avg is:" + avg);
*/
    }
}

