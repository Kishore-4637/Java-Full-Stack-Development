import java.util.*;
public class LastDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 10;
        System.out.println("Last Digit: " + b);
        sc.close();
    }
}