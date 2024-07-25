/*StringBuffer method4-reverse
  1)public synchronised StringBuffer reverse()*/


  class Demo{
    public static void main(String []args){

        StringBuffer str = new StringBuffer("Core2web");
        System.out.println(str.reverse());

        String str1 = "Shraddha";
        StringBuffer str2 = new StringBuffer(str1);
        System.out.println(str2.reverse().toString());

       }
}
/*
 1)String class donot have reverse method but string buffer has so we can pass parameter to it then convert it back to string using object class method toString
 */

/*
output-
bew2eroC
ahddarhS
 */

