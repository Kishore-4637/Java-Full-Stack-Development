import java.util.*;
public class Placement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CGPA of the student:");
        double cgpa = sc.nextDouble();
        System.out.println("Enter the number of arrears of the student:");
        int arrears = sc.nextInt();
        if (cgpa >= 7.0) {
            if (arrears == 0) {
                System.out.println("The student is eligible for placement.");
            } else {
                System.out.println("The student is not eligible for placement due to arrears.");
            }
            
        } else {
            System.out.println("The student is not eligible for placement.");
        }

    }
    
}
