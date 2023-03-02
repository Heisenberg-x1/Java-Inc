import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Code {
    public static void main(String[] args) {
        // FIXME: Declaring floats
        float x = 34.5f;
        System.out.println(x);

        char a = 'a';
        String b = "Who let the dogs out";
        int c = 12;
        boolean d = true;
        if (d) {
            System.out.println(a + " " + b + " " + c);
        }

        // ?Another way to write an if else statement is by using a one liner with the ?
        // operator as follows

        int num = 10;
        int num2 = 10 > 12 ? 12 : 10;
        System.out.println(num2);

        // TODO:ARRAYS
        // ?We can create an array in java as follows
        int[] arr = new int[10];
        // we can confirm the length of the array as follows
        System.out.println("The length of the array is " + arr.length);
        // we can also create an array by defining the array values
        int[] arr2 = { 12, 34, 45, 5, 24, 56 };

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        // !Do while loop is a special kind of while loop the runs the block of code
        // atleast once before checking the condition
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i < 4);

        // TODO: SHORTS, INT AND LONG
        short y = 12;
        short z = 13;
        byte e = 10;
        // ?In terms of size, byte(1),short(2), int(4) and finally long(8)

        // GCD
        /**
         * int first = Integer.parseInt(System.console().readLine("Enter the first
         * number: "));
         * int second = Integer.parseInt(System.console().readLine("Enter the second
         * number: "));
         * int gcd = 0;
         * if (first > second) {
         * for (int k = 1; k <= second; k++) {
         * if (first % k == 0 && second % k == 0) {
         * gcd = k;
         * }
         * }
         * } else{
         * for(int k = 1; k <= first; k++){
         * if (first % k == 0 && second % k == 0) {
         * gcd = k;
         * }
         * }
         * }
         * System.out.println("Gcd: " + gcd);
         */

        // TODO: - creation of variables involves declaration and assigning a value.
        // Combining the 2 is called initialisation. When creating long variables, we
        // have to add L at the end for some reason.Likewise, when we create floats, we
        // have to add f at the end. char are sorounded by a single quotation mark
        // unlike Strings.
        long number = 24342354234L;
        float fl1 = 12.5f;
        // TODO: Another way to get console inputs is by using scanner. We first need to
        // import the scanner class.
        /*
         * 
         * Scanner var = new Scanner(System.in);
         * String name = var.nextLine();
         * int num3 = var.nextInt();
         * System.out.println(name + " " + num3);
         */

        // int age = Integer.parseInt(System.console().readLine("Enter your age: "));
        // System.out.print(age);

        //FIXME: GUI - Graphical User Interphase
        String name = JOptionPane.showInputDialog("What is your name?");
        int height = Integer.parseInt(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null,"Hello " + name + " You are " + height + " cm high");

        //FIXME: MATH CLASS
         


        System.out.println("\n");
    }
}
