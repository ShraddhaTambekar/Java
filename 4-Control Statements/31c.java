class Demo{
    public static void main(String []args){

        int i = 8;
        switch(i){
            case 1:
               System.out.println("one");
            case 2:
               System.out.println("Two");
            case 3:
               System.out.println("Three");
            case 4:
               System.out.println("Four");
            case 5:
               System.out.println("Five");
            default:
               System.out.println("No match"); 
            case 6:
               System.out.println("six");
        }

        System.out.println("After Switch");
    }
}

/*
 output-
       No match
       six
       After Switch
 */

/*
  1)If no match is found it goes to default and execute all statements below it
*/