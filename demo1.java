public class demo1 {
    int data; //istance variable
    
    demo1(){
        System.out.println("objest is constructed");
    }
    public static void main(String[] args) {
        demo1 dd; // dd reference is declaired
        dd=new demo1(); //dd initialized by jvm //dd holds teh base address of demo1 class object
        System.out.println(dd.data);
        dd.data += 5; //dd.data=dd.data+5|
        System.out.println(dd.data);
        inc(dd);
        System.out.println(dd.data);
        
    }
    static void inc(demo1 aa){
        System.out.println(aa.data);
        aa.data += 10;
    }

}
