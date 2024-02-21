package Silindir;

public class Cylinder extends Circle {
     double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height=Math.max(0,height);
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

}
