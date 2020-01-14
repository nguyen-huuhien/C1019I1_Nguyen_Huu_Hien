package b7_CleanCode.TH.Refactoring_TachPhuongThuc.java_cleancode_refactoring_method_extraction_master.src;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(double radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }
}
