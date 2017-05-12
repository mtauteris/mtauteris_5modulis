/**
 * Created by Minde on 2017.05.11.
 */
public class Road {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;

    public String evaluate() {
        if (a||(e||f)&&(b||c)) {
            return "Iš taško A į tašką B patekti galima";
        } else {
            return "Iš taško A į tašką B patekti negalima";
        }
    }

    public boolean revert(int number){
        if (number==1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public boolean isC() {
        return c;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public boolean isD() {
        return d;
    }

    public void setD(boolean d) {
        this.d = d;
    }

    public boolean isE() {
        return e;
    }

    public void setE(boolean e) {
        this.e = e;
    }

    public boolean isF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }
}
