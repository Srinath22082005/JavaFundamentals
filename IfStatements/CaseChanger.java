package IfStatements;

import java.util.Scanner;

public class CaseChanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character to change ");
        char change = sc.next().charAt(0);

        if(Character.isDigit(change)){
            throw new RuntimeException("Enter only the Characters !");
        }

        if(Character.isLowerCase(change)){
            System.out.println(Character.toUpperCase(change));
        }
        else{
            System.out.println(Character.toLowerCase(change));
        }
    }
}
