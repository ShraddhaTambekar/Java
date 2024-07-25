//Concat

class Demo{
    public static void main(String []args){

        String str = "Shraddha";
        String str1 = "Tambekar";
        
        System.out.println(str);
        System.out.println(str1);

        str = str.concat(str1);

        System.out.println(str);
        System.out.println(str1);
    }
}
/*
output-
Shraddha
Tambekar
ShraddhaTambekar
Tambekar
 */

 /*
  1)String is concat at run time therefor new string will be made on heap outside scp
  */
