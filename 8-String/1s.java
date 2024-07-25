//String

class Demo{
    public static void main(String []args){

        String str1 = "Core2web";
        String str2 = new String("Core2web");

        char str3[] = {'A','B','C'};
       
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}

/*
output-
Core2web
Core2web
ABC
 */

/*
1)String str1 is stored in scp(String Constant pool)
2)String str2 is new String object made on heap not in scp
*/