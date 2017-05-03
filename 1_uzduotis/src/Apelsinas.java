/**
 * Created by JP16_2 on 2017.05.03.
 */
public class Apelsinas {
    private double d;
    private double a;
    private double turis;


    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getTuris() {
        return (4/3*3.14*Math.pow((d-a),3));
    }


}
