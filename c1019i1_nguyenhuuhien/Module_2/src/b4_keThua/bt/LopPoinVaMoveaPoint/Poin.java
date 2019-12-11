package b4_keThua.bt.LopPoinVaMoveaPoint;

public class Poin {
    private float x = 0.0f;
    private float y = 0.0f;

    public Poin() {
    }

    public Poin(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public float[] getXY() {
        float []arrXY = {getX(),getY()};
        return  arrXY ;
    }

    @Override
    public String toString() {
        return " (x= "+x+", y="+y+") ";
    }

}
