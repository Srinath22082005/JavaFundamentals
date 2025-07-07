package ForLoop;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        int val = 1;

        for(int i = 0 ; i < range ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(val++ +" ");
            }
            System.out.println();
        }
    }
}
