/*String Method1-Concat
 1)public String concat(str2);
 2)description-
    a)concat String str2 with str1
    b)implements new array of charactor whoes length is sum of (str1 and str2)length
*/

class Demo{
    public static void main(String []args){

        String str = "Shraddha";
        String str1 = "Tambekar";
        
        System.out.println(str);
        System.out.println(str1);

        str = str.concat(str1);

        System.out.println(str);
    }
}

/*
output-
Shraddha
Tambekar
ShraddhaTambekar
 */

