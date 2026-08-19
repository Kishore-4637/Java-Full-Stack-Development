import java.util.*;
public class Mins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/60;
        int c = a%60;
        System.out.println("Hours: " + b);
        System.out.println("Minutes: " + c);
        sc.close();
    }
}