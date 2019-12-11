package b4_keThua.bt.ThietkeVaTrienKhaiLopTriage;

import b4_keThua.th.HeCacDoiTuongHinhHoc.Shape;

public class Triage extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triage() {
    }

    public Triage(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triage(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return (side1*side2)/2;
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "tam giac co 3 canh :" + "\t  canh 1 : " + side1 + " canh 2 : " + side2 + " canh huyen : " + side3
                + "\nco dien tich la :" + getArea()
                +"\nco chu vi la : " + getPerimeter()
                + "\n color : " + getColor()
                + "\n filled ? " + isFilled();
    }

}
