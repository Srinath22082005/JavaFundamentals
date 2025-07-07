public class WelcomeProgram {
    public static void main(String[] args) {
        if(args.length > 1){
            return;
        }
        System.out.println("Welcome "+args[0]);
    }
}
