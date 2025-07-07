package IfStatements;

import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char check = sc.next().charAt(0);
        if(Character.isAlphabetic(check)){
            System.out.println("Alphabhet");
        } else if (Character.isDigit(check)) {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }

    }
}
