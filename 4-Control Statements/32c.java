//Break in switch
class Demo{
    public static void main(String []args){

        int i = 3;
        switch(i){
            case 1:
               System.out.println("one");
               break;
            case 2:
               System.out.println("Two");
               break;
            case 3:
               System.out.println("Three");
               break;
            case 4:
               System.out.println("Four");
               break;
            case 5:
               System.out.println("Five");
               break;
            default:
               System.out.println("No match"); 
               break;
        }

        System.out.println("After Switch");
    }
}

/*
 output-
        Three
        After Switch
 */
