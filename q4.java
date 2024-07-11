import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = Sc.nextInt();
        if ((year%4==0 && year%100!=0) ||(year % 400 == 0)){
           System.out.println("its a leap year");
        }else{
            System.out.println("its not a leap year");
        }
    }
}
