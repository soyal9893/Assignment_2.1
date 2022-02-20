import java.util.*;
public class Qouestion_4 {
    public static void main(String[] args) {
        //Write a Java program to convert temperature from Fahrenheit to Celsius degree
        System.out.println("Enter temperature in fahrenheit");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        float num1= (num-32)*5;
        float num2= num1/9;
        System.out.println(num2 +" "+ "C");
    }
}

