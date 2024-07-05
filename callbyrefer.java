public class callbyrefer {
    int data;
public static void main(String[] args) {
    callbyrefer tt =new callbyrefer();
    System.out.println("before inceament : "+ tt.data);
    
    increment(tt);
    System.out.println("after increment : "+tt.data);
    increment1(tt.data);
    System.out.println("after the inrement1 : "+tt.data); 
}
public static void increment(callbyrefer qq){
    qq.data += 5;

}
public static void increment1(int a){
    a += 6;
}
}
