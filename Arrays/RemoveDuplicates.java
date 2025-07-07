package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {12,34,12,45,67,89};
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            count = 0;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j] ){
                   count++;
                }
            }
            if(count == 0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
