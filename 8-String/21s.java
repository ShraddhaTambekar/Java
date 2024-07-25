class Demo{
    public static void main(String []args){

        String str1 = "Core2web";
        String str2 = new String("Bagal");

        StringBuffer str3 = new StringBuffer("Core2web");
        
        String str4 = str1.concat(str3);           //error because string concat parameter cannot be string buffer
        StringBuffer str5 = str3.append(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
       }
}
/*
output-
error: incompatible types: StringBuffer cannot be converted to String
 */