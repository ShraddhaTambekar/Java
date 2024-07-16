class Demo{
    public static void main(String []args){

        String str ="Krishna";
        switch(str){
            case "Radha":                         
               System.out.println("Radha");
               break;
            case "Meera":                            
               System.out.println("Meera");
               break;
            case "Rukmini":
               System.out.println("Rukmini");
               break;
            case "Shraddha":
               System.out.println("Shraddha");
               break;
            case "Krishna":
               System.out.println("Krishna");
               break;
            default:
               System.out.println("No match"); 
               break;
        }

        System.out.println("After Self Realization");
    }
}

/*
 output-
        Five
        After Self Realization
 */

/*
 1)String and enum Expression is allowed since java 1.7
 */
