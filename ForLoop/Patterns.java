package ForLoop;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int size = sc.nextInt();

        for(int i = 0; i < size ; i++){
            for(int j = 0 ; j < Math.abs(i-size) ; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
