package staticexample;

public class Main {
    static void main() {
        Human st=new Human(12,"harshit",1000,false);
        Human rahul=new Human(12,"rahul",1000,true);
        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
