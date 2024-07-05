public class array {
public static void main(String[] args) {
    //aray declairation
    int arr[];
    String str[];
    //aray construction
    arr = new int[3];
    str = new String[3];
    //array intialization
    arr[0] = 10;
    arr[2] = 20;
    str[0] = "java";
    str[2] = "asit";
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println(str[0]);
    System.out.println(str[1]);
    System.out.println(str[2]);
    
    System.out.println(arr.length);
    System.out.println(str.length);
}

}
