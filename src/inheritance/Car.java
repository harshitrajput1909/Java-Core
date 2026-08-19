package inheritance;

public class Car extends Vehicle{
    public int NoOfDoors;
    public String TransmissionType;
    Car(String name,String model,int NoOfTyres,int doors,String type){
        super(name,model,NoOfTyres);
        this.NoOfDoors=doors;
        this.TransmissionType=type;
    }
    public void startAc(){
        System.out.println("Ac is started "+name);
    }

}
