package b4_keThua.bt.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double hight = 2 ;

    public Cylinder() {
    }

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getvolume() {
        return getHight()*Math.PI*Math.pow(super.getRadius(),2);
    }

    @Override
    public String toString() {
        return "A Cylinder with radius :  "
        + getRadius()
                + " and hight "
                + getHight()+ " color " + getColor()
                + " volume =  " + getvolume()
                 ;
    }
}
