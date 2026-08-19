package inheritance;

public class MainVechile {
    static void main() {
//        MotorCycle m1=new MotorCycle("hayabusa","2026",2,"yes","good");
//        m1.Start();
//        m1.whellie();
//        m1.stop();
        Car c=new Car("BMW","2026",4,2,"sports");
        c.Start();
        c.startAc();
        c.stop();

    }
}
