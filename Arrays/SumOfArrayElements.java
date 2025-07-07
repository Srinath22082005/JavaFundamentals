package Arrays;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean check = false;
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if(arr[i] == 6){
                check = true;
            }
            if(check){
                if(arr[i] == 7){
                    check = false;
                    continue;
                }
                continue;
            }
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}
