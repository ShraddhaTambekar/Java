/*String Method6-equals
 1)public boolean equals(Object obj);
 2)description-
    a)checks content of strings (case sensitive) and return true if same
*/
class Demo{
    public static void main(String []args){

        String str = "Core2web";
        String str1 = "core2web";

        System.out.println(str.equals(str1));
    }
}
/*
 output-false
 */