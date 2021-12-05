
public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 100, "Verizon", "Ring Ring Ring");
        Iphone iphoneTen = new Iphone("X", 99 , "AT&T", "Zing");
        
        s9.displayInfo();
        System.out.println(s9.unlock());
        
        System.out.println(">-----------------------------<");
        iphoneTen.displayInfo();
        System.out.println(iphoneTen.unlock());
    }
    
}