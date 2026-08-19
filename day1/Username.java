import java.util.*;
public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username= "Kishore";
        String password= "1234";
        System.out.println("Enter the username:");
        username = sc.nextLine();
        System.out.println("Enter the password:");
        password = sc.nextLine();
        if (username.equals("Kishore") && password.equals("1234")) {
            System.out.println("Login successful.");
        } else if (username.equals("Kishore") && !password.equals("1234")) {
            System.out.println("Incorrect password.");
            System.out.println("Enter 1 to retry or 2 to reset your password:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Retry password.");
                    System.out.println("Enter the password:");
                    sc.nextLine();
                    password = sc.nextLine();
                    if (password.equals("1234")) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Incorrect password.");
                    }
                    break;
            
                case 2:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("reset password.");
                    System.out.println("Enter the new password:");
                    String password1 = sc1.nextLine();
                    System.out.println("Confirm the new password:");
                    String confirmpassword = sc1.nextLine();
                    if (!password1.equals(confirmpassword)) {
                        System.out.println("Passwords do not match. Password reset failed.");
                        break;
                    }else {
                        password = password1;
                        System.out.println("Password reset successful.");
                    }
                    break;
            }
        }

        else if (!username.equals("Kishore") && password.equals("1234")) {
            System.out.println("Incorrect username.");
        } else {
            System.out.println("Incorrect username and password.");
        }
    }
}