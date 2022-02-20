import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
     //   Write a program to print the product of the decimal and int numbers ex: 8.2 and 6
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter a number");
        float num = sc.nextFloat();
        float pro= num*num1;
        System.out.println(pro);
    }
}
