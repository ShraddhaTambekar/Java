/*String Method6-equals
 1)public boolean equalsIignoreCase(Object obj);
 2)description-
    a)checks content of strings (not case sensitive) and return true if same
*/
class Demo{
    public static void main(String []args){

        String str = "Core2web";
        String str1 = "core2web";

        System.out.println(str.equalsIgnoreCase(str1));
    }
}
/*
 output-true
 */
