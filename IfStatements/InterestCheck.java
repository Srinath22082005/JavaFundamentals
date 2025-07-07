package IfStatements;

import java.util.Scanner;

public class InterestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        if(gender.equalsIgnoreCase("female") && age >= 1 && age <= 58){
            System.out.println("The Percentage of Interest is 8.2%");
        } else if (gender.equalsIgnoreCase("female") && age >= 59 && age <= 100) {
            System.out.println("The Percentage of Interest is 9.2%");
        } else if (gender.equalsIgnoreCase("male") && age >= 1 && age <= 58) {
            System.out.println("The Percentage of Interest is 8.4%");
        }else if (gender.equalsIgnoreCase("male") && age >= 59 && age <= 100) {
            System.out.println("The Percentage of Interest is 10.5%");
        }
        else{
            System.out.println("Enter the details Correctly");
        }
    }
}
