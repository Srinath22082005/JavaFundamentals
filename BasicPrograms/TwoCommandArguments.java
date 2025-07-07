public class TwoCommandArguments {
    public static void main(String[] args) {
        String args1 = args[0];
        String args2 = args[1];
        if(args1.equals("Wipro") && args2.equals("Bangalore")){
            System.out.println("Wipro Technologies Bangalore");
        } else if (args1.equals("ABC" )&& args2.equals("Mumbai")) {
            System.out.println("ABC Technologies Mumbai");

        }

    }
}
