import java.util.*;
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a hour");
        float num = sc.nextFloat();
        double num1= num*0.0416667;
        double num2= num*0.000114155;
        System.out.println(num1+" "+"day");
        System.out.print(num2+" "+"year");
    }
}
