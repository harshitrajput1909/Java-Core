package inheritance;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;

    }
    Box(double side){
//        super(); call the obj class every class have its parent class as obj class
        this.h=side;
        this.l=side;
        this.w=side;
    }
    Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
    this.l=old.l;
    this.w=old.w;
    this.h=old.h;


    }


}
