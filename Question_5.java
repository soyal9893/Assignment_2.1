import java.util.*;
public class Question_5 {
    public static void main(String[] args) {
      //  Write a Java program that reads a number in inches, converts it to meters.
        System.out.println("Enter a dimention in inch");
        Scanner sc= new Scanner(System.in);
        float in= sc.nextFloat();
        double Mtr=in*0.0508;
        System.out.println(Mtr + " "+"meter");
    }
}
