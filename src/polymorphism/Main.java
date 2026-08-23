package polymorphism;

public class Main {
    static void main() {
        Shapes shapes=new Shapes();
        Circle circle =new Circle();
//        Square square=new Square();
        Shapes square=new Square();
        // it will print the area or whose constructor will be called
        square.area();
        circle.area();
    }
}
