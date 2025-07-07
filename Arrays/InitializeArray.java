package Arrays;

public class InitializeArray {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10,10};
        int sum = 0;
        double avg = 0.0d;

        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
        }
        avg = (double)sum/arr.length;
        System.out.println("The Sum is "+sum+" and the Average is "+avg);
    }
}
