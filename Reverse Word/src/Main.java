import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please Enter Your Word");
        String word = read.next();


        char[] try1 = word.toCharArray();
        System.out.print("The Reversed Word: ");

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}