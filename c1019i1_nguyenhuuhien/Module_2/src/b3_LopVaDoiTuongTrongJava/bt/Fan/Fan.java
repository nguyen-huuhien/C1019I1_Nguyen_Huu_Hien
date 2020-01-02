package b3_LopVaDoiTuongTrongJava.bt.Fan;

public class Fan {
    private boolean on = false;
    private int speech = 1;
    private double radius = 5.0;
    private String collor = "blue";

    public Fan() {
    }

    public Fan(boolean on, int speech, double radius, String collor) {
        this.on = on;
        this.speech = speech;
        this.radius = radius;
        this.collor = collor;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeech() {
        return speech;
    }

    public void setSpeech(int speech) {
        this.speech = speech;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    @Override
    public String toString() {
        if (isOn() == false) {
            return " is off:"
                    + "\nColor = " + getCollor()
                    + "\nradius = " + getRadius()
                    + "\n----------------------------------------------";
        } else {
            return " is on: "
                    + "\nSpeech = " + getSpeech()
                    + "\nColor = " + getCollor()
                    + "\nradius = " + getRadius()
                    + "\n-----------------------------------------------";
        }
    }
}
