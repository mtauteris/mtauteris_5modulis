/**
 * Created by Minde on 2017.05.09.
 */
public class Sphere {

    private int radius;
    private double volume;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return 4*Math.PI*Math.pow(radius,3)/3;
    }
}
