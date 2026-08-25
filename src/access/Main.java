package access;

public class Main {
    static void main() {
        A a =new A(23,"harshit");
        // i have set the num value to 8 so when ever i call the get function it gives me 8 it means i can set a private variable
        // according to me
        a.setNum(8);
        int x= a.getNum();
        System.out.println(x);
        // i cannot access this num data member because it is private but i can access it with the getters and setters function
//        System.out.println(a.num);
        System.out.println(x);
    }
}
