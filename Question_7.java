import java.util.*;
public class Question_7 {
    public static void main(String[] args) {
       // Write a Java program to convert minutes into a number of years and days
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num in minutes");
        float min= sc.nextFloat();
        double days= min*0.000694444;
        double years=min/525600;
        System.out.println(days + " "+"Days");
        System.out.println(years +" "+"Years");
    }
}
