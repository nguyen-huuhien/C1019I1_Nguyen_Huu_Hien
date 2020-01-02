package b3_LopVaDoiTuongTrongJava.bt.Fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(true, 3, 10.0, "yellow");
        Fan fan2 = new Fan(false, 2, 5.0, "blue");
        System.out.println("Fan 1" + fan1.toString());
        System.out.println("Fan 2" + fan2.toString());
    }
}
