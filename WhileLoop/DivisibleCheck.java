package WhileLoop;

public class DivisibleCheck {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        while(count != 5){
            if(num % 2 == 0 && num % 3 == 0 && num % 5 == 0){
                System.out.print(num +" ");
                count++;
            }
            num++;
        }
    }
}
