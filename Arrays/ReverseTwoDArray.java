package Arrays;

public class ReverseTwoDArray {
    public static void main(String[] args) {
        if(args.length == 4){
            int[][] arr = new int[2][2];
            int index = 0;
             for (int i = 0; i < arr.length ; i++) {
                 for(int j = 0 ; j < arr.length ; j++){
                     arr[i][j] = Integer.parseInt(args[index++]);
                 }
            }
           for(int i = arr.length-1 ; i>=0  ; i--){
               for(int j = arr.length-1 ; j>= 0 ; j--){
                   System.out.print(arr[i][j] + " ");
               }
               System.out.println();
           }
        }
        else{
            return;
        }

    }
}
