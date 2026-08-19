import java.util.*;
public class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println("Addition: " + c);
        System.out.println("Subtraction: " + d);
        System.out.println("Multiplication: " + e);
        System.out.println("Division: " + f);
        System.out.println("Modulus: " + g);
        sc.close();

}
    
}
