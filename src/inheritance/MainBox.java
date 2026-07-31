package inheritance;

public class MainBox {
    static void main() {
        Box b1=new Box();
        Box b2=new Box(4);
        Box b3=new Box(b1);
        BoxWeight b4=new BoxWeight();//referencing a child to a child
        System.out.println(b4.h+" "+b4.weight);
//        System.out.println(b3.l+" "+b3.weight);
//        System.out.println(b1.l+" "+b1.w);
//        System.out.println(b2.l+" "+b2.w);
        Box b5=new BoxWeight(4,5,6,8);//refrencing a parent to a child
//        System.out.println(b5.l+" "+b5.weight);
//        BoxWeight b6=new Box(4,5,6);//referencing a child to a parent which is not valid
                        
    }
}
