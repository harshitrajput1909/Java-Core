package inheritance;

public class MotorCycle extends Vehicle {
    public String HandleBarStyle;
    public String SuspensionType;
    MotorCycle(String name,String model,int nooftyres,String handlebar,String suspension){
        super(name,model,nooftyres);
        this.HandleBarStyle=handlebar;
        this.SuspensionType=suspension;
    }
    void whellie(){
        System.out.println("The bike is doing Whellie "+name);
    }
}
