import java.util.*;
public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student:");
        int marks = sc.nextInt();
        if (marks >= 50) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }
    }
    
}
