import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // TODO: (i)Create a program similar to the previous one, but this time the name
        // of
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

        // TODO: (ii)Create a program which inputs two integer numbers, and for each
        // integer number in the range defined by these two integers, it outputs the
        // half of those numbers. To convert a string (provided as input) into an intege
        // number, you can use the following conversion function
        /*
         * int i;
         * for( i=1;i<=4;i++){
         * System.out.println((i/2.0));
         * }
         * i =4;
         * System.out.println("Altogether " + i + " numbers are printed out");
         */

        // TODO: (iii)Create a program which inputs two integer numbers, and for each
        // integer number in the range defined by these two integers, it outputs the
        // half of those numbers. To convert a string (provided as input) into an
        // integer number, you can use the following conversion function:
        /*
         * System.out.println("Enter num 1: ");
         * int num1 = Integer.parseInt(System.console().readLine());
         * System.out.println("Enter num 2: ");
         * int num2 = Integer.parseInt(System.console().readLine());
         * if(num1 > num2){
         * for(int i=num2;i<=num1;i++){
         * System.out.println(i/2.0);
         * }
         * }
         */

        // TODO: (iv)Create a program which converts its first two command-line
        // arguments into integer numbers, and computes their sum, difference, product,
        // as well as the quotient and remainder of integer division. The integer
        // division should not be performed when the second number is zero. The results
        // should be printed on the standard output. The program should print an error
        // message if less than two command-line arguments were provided. The error
        // message should be printed on the standard error (System.err) stream.

        /*
         * if (args.length != 2) {
         * System.err.println("Invalid args count!!");
         * } else {
         * System.out.println("Sum of the args is: " + (Integer.parseInt(args[0]) +
         * Integer.parseInt(args[1])));
         * System.out.println("Product of the args is: " + (Integer.parseInt(args[0]) *
         * Integer.parseInt(args[1])));
         * if (Integer.parseInt(args[0]) > Integer.parseInt(args[1])) {
         * System.out.println("Difference: " + (Integer.parseInt(args[0]) -
         * Integer.parseInt(args[1])));
         * 
         * } else {
         * System.out.println("Difference: " + (Integer.parseInt(args[1]) -
         * Integer.parseInt(args[0])));
         * 
         * }
         * if (Integer.parseInt(args[0]) != 0 && Integer.parseInt(args[1]) != 0) {
         * 
         * System.out.println("Quotient: " + (Float.parseFloat(args[1]) /
         * Float.parseFloat(args[0])));
         * }
         * 
         * }
         */

        // TODO: (v)Implement a program which computes the factorial of a given natural
        // number.

        /*
         * int n = Integer.parseInt(System.console().readLine());
         * int fac = 1;
         * for (int i = 1; i <= n; i++) {
         * fac *= i;
         * }
         * System.out.print("Factorial of " + n + " is " + fac);
         */

        // TODO: Create a program which takes its first command-line argument as an
        // integer number, and decides whether this number is a perfect number. In
        // number theory, a natural number is called perfect, if the sum of its positive
        // divisors (excluding the number itself) is equal to the number. (Or,
        // equivalently, the sum of the positive divisors equals to two times the
        // number.) The first four perfect numbers are: 6, 28, 496 and 8128.

        /*
         * int n = Integer.parseInt(args[0]);
         * int sumDiv = 0;
         * for(int i=1;i<n;i++){
         * if(n%i == 0){
         * sumDiv+=i;
         * }
         * }
         * if(sumDiv==n){
         * System.out.println("Number is perfect!!");
         * } else{
         * System.out.println("Number not perfect!!");
         * }
         */

        // TODO:(vi)Change the previous program in such a way that it computes how many
        // perfect numbers are in the range between 1 and the number given as the first
        // command-line argument

        // TODO:(vii)Compute the greatest common divisor of the (positive or negative)
        // integer numbers provided as command-line arguments. Your program should
        // convert all of its command-line arguments into integer numbers, and compute
        // their greatest common divisors.The command-line arguments and the result
        // should be represented with long values. This type is a 64-bits signed integer
        // type. To convert a string to this type, use the Long.parseLong(...) function
        long[] arr = new long[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Long.parseLong(args[i]);
        }
        long min = Arrays.stream(arr).min().getAsLong();
        long gcd = 0;
        for (int i = 1; i < min; i++) {
            int tempgcd = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0) {
                    continue;
                } else {
                    tempgcd = i;
                }
            }
            if (tempgcd > gcd) {
                gcd = tempgcd;
            }
        }
        System.out.println(gcd);

    }

}