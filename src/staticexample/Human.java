package staticexample;

public class Human {
    int age;
    String  name;
    int salary;
    boolean married;
   static  int population;
//   staic variable do not depends on object it is same for every call when we acess this

    public Human(int a,String  b,int c,boolean x){
        this.age=a;
        this.name=b;
        this.salary=c;
        this.married=x;
        Human.population+=1;// in this everything we make an obj
        // the human class population variable which is static is increase by 1

    }
}
