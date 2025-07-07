package ForLoop;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int count = 0 ;

        for(int i = 10 ; i <= 99 ; i++){
            count = 0;
            for(int j = 2 ; j <= Math.sqrt(i) ; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(i +" ");
            }
        }
    }
}
