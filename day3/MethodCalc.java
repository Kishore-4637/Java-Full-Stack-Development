package day3;
import java.util.*;
public class MethodCalc {
public static void displayName(){
        System.out.println("-------------------");
        System.out.println("welcome to the calculator");
        System.out.println("------------------------");
    }
    public static int addition(int a,int b ){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        if(b==0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
        }

    public static void main(String[] args) {
        displayName();
        System.out.println("enter the operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("enter your choice");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println(addition(num1,num2));
                break;
            case 2:
                System.out.println(sub(num1,num2));
                break;
            case 3:
                System.out.println(mul(num1,num2));
                break;
            case 4:
                System.out.println(div(num1,num2));
                break;
            default:
                System.out.println("invalid choice");
            }
            sc.close();
        }
    }
        
        
    
    

