package inheritance;

public class Vehicle {
   public String name;
    public String year;
   public int NoOfTyres;
    Vehicle(){
        this.name="";
        this.year="";
        this.NoOfTyres=-1;
    }
    Vehicle(String name,String model,int tyre){
        this.name=name;
        this.year=model;
        this.NoOfTyres=tyre;

    }
    void Start(){
        System.out.println("Engine is started "+this.name);
    }
    void stop(){
        System.out.println("Engine is stoped "+this.name);
    }
}
