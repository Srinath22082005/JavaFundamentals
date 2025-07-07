package Arrays;

import java.util.Scanner;

public class CheckingNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,34,56,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check : ");
        int check = sc.nextInt();

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == check){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
