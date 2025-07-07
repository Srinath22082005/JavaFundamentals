package IfStatements;

import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check : ");
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println("Zero");
        }
        else if(n > 0){
            System.out.println("Positive Number ");
        }
        else{
            System.out.println("Negative Number");
        }

    }

}
