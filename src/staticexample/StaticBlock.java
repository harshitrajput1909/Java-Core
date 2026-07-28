package staticexample;

//initialisation of static block
public class StaticBlock {
    static int a=4;
    static int b;
    static{
        //only run once when the first obj is created
        System.out.println("hello i am in static block");
        b=a*3;
    }

    static void main() {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        b+=3;
        System.out.println(StaticBlock.b);
    }
}
