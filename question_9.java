import java.util.*;
public class question_9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter limit");
        int n = sc.nextInt();
        for(int i=1; i<n; i++ )
            for(int j=1; j<=i;j++)
                System.out.println('*');

    }
}
