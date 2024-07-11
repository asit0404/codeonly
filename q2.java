import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the neme");
        int neme = Sc.nextInt();
        System.out.println("enter the age");
        int age = Sc.nextInt();

        if (age>=18){
            System.out.println("yes you can vote");
        }else{
            System.out.println("no you cant vote");
        }
    }

}
