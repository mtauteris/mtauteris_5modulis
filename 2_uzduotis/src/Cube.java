/**
 * Created by Minde on 2017.05.09.
 */
public class Cube {

    private int a;
    private double volume;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getVolume() {
        return Math.pow((double)a,3);
    }
}
