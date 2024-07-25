class Demo{
    public static void main(String []args){

        String str1 = "Core2web";
        String str2 = new String("Core2web");

        String str3 = "Core2web";
        String str4 = new String("Core2web");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode()); 
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());  
        
    }
}
/*
output-
-403525087
-403525087
-403525087
-403525087
 */
/*
 1)hashCode is method of object class and it makes hashCode on hash formula
 2)hashCode check content
 */
