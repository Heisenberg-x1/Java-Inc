import java.util.Arrays; //!Array methods
import java.util.List; //!Work with lists
import java.util.Scanner;
import javax.swing.JOptionPane; 
import java.util.Random; //!Enables us to access the random numbers

public class Code {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

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
        /*
        String name = JOptionPane.showInputDialog("What is your name?");
        int height = Integer.parseInt(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null,"Hello " + name + " You are " + height + " cm high");
        */

        //FIXME: MATH CLASS
         x = 22222;
         y = -2100;
         System.out.println(Math.max(x,y)); // ?max of two numbers.Math.min() will give the minimum 
         Math.abs(y); // ?will give us the absolute value of a number.in this case 2100
         Math.sqrt(x);
         Math.round(12.4); //?normal rounding off
         Math.floor(12.7);//?Rounds down, here its gonna be 12
         Math.ceil(12.4);//?Rounds up. we will have 13

         //FIXME: RANDOM NUMBERS
         //?First we need to create an instance of the random number(After importing the random class)
         Random random = new Random();//!creating a new instance of the rans=
         int r = random.nextInt(10); //?Here we are creating an instance of the random number. The parameter passed is the upper bound.
         double s = random.nextDouble(10.0);//?Random double
         Boolean t = random.nextBoolean();//?a random boolean value

         System.out.println(r + "\n" + s + "\n" + t);

         //FIXME: SWITCH
         int day = 3;
         /*
          * 
          switch (day) {
            case 0:
                System.out.println("Line 1");
                break;
            case 1:
                System.out.println("Line 2");
                break;
            case 2:
                System.out.println("Line 3");
                break;
         
            default:
                System.out.println("Any line");
                break;
         }
          */
         //FIXME: INVERTED TRIANGLE FIGURE
         /*
          int lim = 5;
         for(int j=0;j<5;j++){
            if(lim==0){
                break;
            }
            for(int k=0;k<lim;k++){
                System.out.print(("*"));

            }
            lim--;
            System.out.print("\n");
         }

          */

        // System.out.println("\n");

        //FIXME: ARRAYS
        int[] numbers = {12,5,34,54,67,7};
        //*You cannot access an element that  is out of the bounds of the array.  */
        //!We can also create an array by specifying the size before the add the elements later
        String[] colors = new String[4];
        colors[0] ="red"; 
        colors[1] ="green"; 
        colors[2] ="yellow"; 
        colors[3] ="blue"; 
        System.out.println(colors[3]);
        //TODO: 2D ARRAYS
        int[][] two = new int[3][2];
        for(int l=0;l<3;l++){
            for(int m=0;m<2;m++){
                
                Random ran = new Random();
                int q = ran.nextInt(10);
                
                two[l][m] = q;
            }
        }
        int[][] two2 = two;
        for(int l=0;l<3;l++){
            for(int m=0;m<2;m++){
                System.out.print(two[l][m] + " ");
            }
            System.out.println();

        }

        //TODO: ARRAY METHODS
        System.out.println(Arrays.equals(colors, two)); //?Compare if two arrays are equal
        System.out.println(Arrays.deepEquals(two2, two)); //?Compare if two 2D arrays are equal
        char[] arr3 = new char[5];
        Arrays.fill(arr3,'x'); //? Fill an array with a specified element
        System.out.println(Arrays.toString(arr3));
        List<String> list = Arrays.asList(colors);
        System.out.println(list.toString());
        



    }
}
