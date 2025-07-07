package IfStatements;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to Check : ");
        int n = sc.nextInt();

        if((n & 1) == 1){
            System.out.println("Odd Number ");
        }
        else{
            System.out.println("Even Number");
        }
    }
}
