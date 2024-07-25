import java.io.*;
import java.util.*;
class DataOverFlowException extends IOException{

      DataOverFlowException(String msg){         
          super(msg);
      }   
}

class DataUnderFlowException extends IOException{

    DataUnderFlowException(String msg){        
          super(msg);
    }   
}

class ArrayDemo{
    public static void main(String []args)throws DataOverFlowException,DataUnderFlowException{

        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer value");
        System.out.println("Note: 0 <element< 100");

        for(int i = 0;i<arr.length;i++){
              int data = sc.nextInt();

              if(data <0)
                    throw new DataOverFlowException("Mitra Data 0 peksha kami ahe");   //as we have extended compile time exception this error is their so to handle we need to handle it will compile time exception (throws or try catch)

              if(data>0)
                    throw new DataUnderFlowException("Mitra data 0 peksha motha ahe");
                    
              arr[i] = data;     
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + "");
        }
    }
}


