//throw in user defined exception
import java.util.*;
class DataOverFlowException extends RuntimeException{// here if we extend IOException class (compile time exception) then unreported error come

      DataOverFlowException(String msg){         //in all exception constructor have 2 parameter 1) nothing 2) string
          super(msg);
      }   
}

class DataUnderFlowException extends RuntimeException{

    DataUnderFlowException(String msg){        
          super(msg);
    }   
}

class ArrayDemo{
    public static void main(String []args){

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer value");
        System.out.println("Note: 0 <element< 100");

        for(int i = 0;i<arr.length;i++){
              int data = sc.nextInt();

              if(data <0)
                    throw new DataOverFlowException("Mitra Data 0 peksha kami ahe");

              if(data>0)
                    throw new DataUnderFlowException("Mitra data 0 peksha motha ahe");
                    
              arr[i] = data;     
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + "");
        }
    }
}

//sare predefined exception mai bus constructor hai body toh throwable class mai hai