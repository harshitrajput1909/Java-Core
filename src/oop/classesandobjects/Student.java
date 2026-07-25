package oop.classesandobjects;

public class Student {
    static void main() {


        Students s = new Students(10,"newharsit",129.2f);
//        s.rollno=16;
//        s.name="harshit rajput";
//        s.marks=66.9f;
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.marks);
        Students random=new Students(s);
        System.out.println(random.name);
//        s.greeting();
//
//        s.changeName("harshu");
//        s.greeting();
        Students one=new Students();
        Students two=one;
        one.name="Something something";
        System.out.println(two.name);
        System.out.println(two.marks);
    }
}
class Students{
    int rollno;
    String name;
    float marks;
    // just a greeting function take the value of name which is current
    void greeting(){
        System.out.println("Hello my name is "+this.name);
    }
    //happens only when call and chnge the value of name
    void changeName(String namee){
        name=namee;
    }
    // constructor without parameter
    Students(){
        this.rollno=16;
        this.name="harshit";
        this.marks=69.0f;
    }
    //parameterised constructor
    Students(int rollno,String name,float marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    // copy the one obj value to another obj
    Students(Students s){
        this.name=s.name;
    }

}