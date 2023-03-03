import java.util.Arrays;
public class Class {
    //Class name in caps 
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("msg");
        String[] arr2 = "Heisenberg".split(""); //?Splitting a string to form an array
        for (String string : arr2) {
            System.out.println(string);
        }
        String name = "name";
    }
}
