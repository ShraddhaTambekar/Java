/*String Method4-compareTo
 1)public int cmpareTo(String str2);
 2)description-
    a)it compares the str1 to str2 (case sentitive),if both the strings are equal, it returns 0 otherwise return the comparison
*/

class Demo{
    public static void main(String []args){

        String str = "Core2web";
        String str1 = "core2web";

        System.out.println(str.compareTo(str1));
    }
}
/*
 output-
 -32
 */
