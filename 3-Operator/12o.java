class Demo{                                     //Logial Operator
          public static void main(String []args){
            
            int x = 5;
            int y = 7;
            int ans = x && y;       //ct error: bad operand types for binary operator '&&' ...as in java numbers are not considered 1/0 or true/false
            
            System.out.println(ans);

          }
}