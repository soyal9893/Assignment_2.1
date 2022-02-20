import java.util.*;
public class Quesntion_1 {
    public static void main(String[] args) {
       // Write a program to add 3 to the ASCII value of the any character user provides and print the
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Alphabet");
        char A = sc.next().charAt(0);
        System.out.println("Enter 2nd Alphabet");
        char B = sc.next().charAt(0);
        System.out.println("Enter 3rd Alphabet");
        char C = sc.next().charAt(0);
        int S = 'A' + 'B' + 'C';
        System.out.println(S);

    }
}
