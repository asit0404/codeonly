
import java.util.Scanner;

public class q5 {
 public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the total marks");
        double total = Sc.nextDouble();
        System.out.println("enter the 1st sub");
        double sub1 = Sc.nextDouble();
        System.out.println("enter the 2nd sub");
        double sub2 = Sc.nextDouble();
        System.out.println("enter the 3rd sub");
        double sub3 = Sc.nextDouble();
        double gotmarks = sub1+sub2+sub3;
        double percentage = total/gotmarks*100;
        System.out.println(percentage);

        if (percentage>=90){
            System.out.println("grade 'A'");
        }else if(percentage>=80){
            System.out.println("grade 'b");
        }else if(percentage>=70){
            System.out.println("grade 'c");
        }else if(percentage>60){
            System.out.println("grade 'd");
        }
        }

    }

