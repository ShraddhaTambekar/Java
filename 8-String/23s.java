/*StringBuffer method3-delete
  1)public synchronised StringBuffer delete(int start,int end)*/


  class Demo{
    public static void main(String []args){

        StringBuffer str = new StringBuffer("Core2web");

        System.out.println(str);
        str.delete(6,7);

        System.out.println(str);
       }
}

/*
output-
Core2web
Core2wb
 */
