package Arrays;

public class FindMaxAndMinValue {
    public static void main(String[] args) {
        int[] arr = {5,3,4,6,7,9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The Max value is " + max + " and the min value is "+min);
    }
}
