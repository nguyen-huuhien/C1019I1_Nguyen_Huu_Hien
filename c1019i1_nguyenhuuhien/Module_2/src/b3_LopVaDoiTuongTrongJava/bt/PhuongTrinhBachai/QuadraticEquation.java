package b3_LopVaDoiTuongTrongJava.bt.PhuongTrinhBachai;

public class QuadraticEquation {
    double a;
    double b;
    double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b*this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b+(Math.sqrt((this.b*this.b)-4*this.a*this.c)))/(2*this.a);
    }
    public double getRoot2() {
        return (-this.b-(Math.sqrt((this.b*this.b)-4*this.a*this.c)))/(2*this.a);
    }




}
