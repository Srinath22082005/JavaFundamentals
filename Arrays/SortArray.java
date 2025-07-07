package Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5,6,2,1,9,0};
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                if(arr[i] > arr[j] ){
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
