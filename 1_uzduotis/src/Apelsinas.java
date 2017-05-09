import java.text.DecimalFormat;

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

    DecimalFormat df = new DecimalFormat("#.##");

    public String getTuris() {
        double v = 4*Math.PI*Math.pow((d/2-a),3)/3;
        return df.format(v);
    }


}
