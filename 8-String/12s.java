/*String Method5-compareToIgnorecase
 1)public int cmpareToIgnoreCase(String str2);
 2)description-
    a)it compares the str1 to str2 (not case sentitive),if both the strings are equal, it returns 0 otherwise return the comparison
*/
class Demo{
    public static void main(String []args){

        String str = "Core2web";
        String str1 = "core2web";

        System.out.println(str.compareToIgnoreCase(str1));
    }
}
/*
 output-0
 */