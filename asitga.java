package asit;

public class asitga {
public void m1(){
    System.out.println("public");
}
protected void m2(){
    System.out.println("protected");
}
void m3(){
    System.out.println("default");
}
private void m4(){
    System.out.println("private");
}

}
public class call(){
    new asitga().m1();
    new asitga().m2();
    new asitga().m3();
    
}