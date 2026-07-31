package inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight =-2;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// this is parent class constructor with three paramenters
        this.weight = weight;
    }
}
