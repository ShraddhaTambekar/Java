/*StringBuffer method2-insert
  1)public synchronised StringBuffer insert(int offset,String str)*/


class Demo{
    public static void main(String []args){

        StringBuffer str = new StringBuffer("Core2web");

        System.out.println(str);
        str.insert(6,"bagal");

        System.out.println(str);
       }
}

/*
output-
Core2web
Core2wbagaleb
 */