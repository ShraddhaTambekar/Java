//user input in jagged array using scanner
import java.util.*;
class Demo{
    public static void main(String []args){
    
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[1];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element values");
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int[] row:arr){
            for(int y:row){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}        
