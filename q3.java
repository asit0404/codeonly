import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1 = Sc.nextInt();
        System.out.println("enter the 2nd number");
        int num2 = Sc.nextInt();
        System.out.println("enter the 3rd number");
        int num3 = Sc.nextInt();
    
        if (num1>=num2){
            if (num1>=num3){
                System.out.println("the biggest number is : "+ num1);

            }else{
                System.out.println("the biggest number is : "+num3);
            }
        }else{
            if(num2>=num3){
                System.out.println("the biggest is : "+num2);

            }else{
                System.out.println("the biggest is : "+ num3);
            }
        }
    }
}
