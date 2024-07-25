//StringBuffer method1-append

class Demo{
    public static void main(String []args){

        String str1 = "Core2web";
        String str2 = new String("Bagal");

        StringBuffer str3 = new StringBuffer("Core2web");
        StringBuffer str4 = str3.append(str1);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
       }
}

/*
1)append is method of stringbuffer its parameter can be string also but string method concate cannot have parameter stringbuffer 
*/

/*
output-
Core2web
Bagal
Core2webCore2web
Core2webCore2web
 */

