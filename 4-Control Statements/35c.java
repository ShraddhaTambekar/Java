class Demo{
    public static void main(String []args){

        char ch = 'A';
        switch(ch){
            case 1:
               System.out.println("one");
               break;
            case 65:                            //ct error-error: duplicate case label
               System.out.println("65");
               break;
            case 'A':
               System.out.println("'A");
               break;
            case 'B':
               System.out.println("B");
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
