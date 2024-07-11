import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter te 1st number");
        int num1 = Sc.nextInt();
        System.out.println("enter the 2nd number");
        int num2 = Sc.nextInt();

        if (num1>num2){
            System.out.println(" the biggest is  : "+ num1);

        }else {
            System.out.println("the biggest is : "+ num2);
        }
    }
}
