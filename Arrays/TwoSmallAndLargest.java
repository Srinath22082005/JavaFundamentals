package Arrays;

public class TwoSmallAndLargest {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,7};
        if(arr.length < 4){
            return;
        }
        int max = Integer.MIN_VALUE;
        int secmax = 0;
        int min = Integer.MAX_VALUE;
        int secmin = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max ){
                secmax = max;
                max = arr[i];

            } if (arr[i] < min) {
                secmin = min;
                min = arr[i];

            }
        }
        System.out.println("The Largest Two numbers is : "+secmax + ","+max);
        System.out.println("The Smallest Two numbers is : "+min + ","+secmin);
    }
}
