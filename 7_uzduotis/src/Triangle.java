/**
 * Created by Minde on 2017.05.10.
 */
public class Triangle {
    private int a;
    private int b;
    private int c;

    public String evaluate() {
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            if ((a==b)&&(b==c)){
                return "Trikampis yra lygiakraštis";
            }else if ((a==b)||(b==c)||(c==a)){
                return "Trikampis yra lygiašonis";
            }else if((a*a+b*b==c*c)||(b*b+c*c==a*a)||(a*a+c*c==b*b)){
                return "Trikampis yra statusis";
            }else {
                return "Trikampis yra įvairiakraštis";
            }
        } else {
            return "Trikampio sudaryti negalima";
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
