package staticexample;

public class StaticMain {
    static void main() {
        //inside static we cannot call a non static method
//    greeting();

    }
    // a non static method cannot use without obj
    static void fun(){
        //#1 greeting();
        // we can access the non static method by referencing to an instances or by creating an object
        StaticMain obj=new StaticMain();
        obj.greeting();
    }
    void greeting(){
        // a static method can we call from a non static method
        fun() ;
        System.out.println("hello how are you");

    }

}

