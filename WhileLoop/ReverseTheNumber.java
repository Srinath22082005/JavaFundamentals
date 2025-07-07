package WhileLoop;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem = 0;
        int rev = 0;

        System.out.println("Enter the Number to Reverse : ");
        int num = sc.nextInt();

        int temp = num;

        while(temp != 0){
            rem = temp % 10;
            rev = rev*10+rem;
            temp /= 10;
        }
        System.out.println(rev);

    }
}
