import java.lang.reflect.Type;

public class Tasks {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // (i) Create a program similar to the previous one, but this time the name of
        // the user should be provided as the first command-line argument. Printing to
        // the standard output is also possible using the following command, which Java
        // programmers usually prefer
        /*
         * if(args.length != 1){
         * System.err.println("Invalid argument number");
         * } else {
         * System.out.println("Hello " + args[0]);
         * }
         */

        // (ii)The program below should print the half of the numbers 1, 2, 3 and 4.
        /*
         * TODO: int i;
         * for( i=1;i<=4;i++){
         * System.out.println((i/2.0));
         * }
         * i =4;
         * System.out.println("Altogether " + i + " numbers are printed out");
         */
        
    }
}