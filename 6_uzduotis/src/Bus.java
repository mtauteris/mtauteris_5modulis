/**
 * Created by Minde on 2017.05.10.
 */
public class Bus {
    private int vi;
    private int mi;
    private int vp;
    private int mp;
    private int ms;
    private int vr;
    private int mr;

    public String calculate(){
        vi+=vp+vr;

        mi+=mp+ms+mr;
        if(mi>=60){
            vi+=mi/60;
            mi=mi%60;
        }
        if (vi>=24){
            vi=vi-24;
        }

        return vi +" val." + mi+" min.";
    }

    public int getVi() {
        return vi;
    }

    public void setVi(int vi) {
        this.vi = vi;
    }

    public int getMi() {
        return mi;
    }

    public void setMi(int mi) {
        this.mi = mi;
    }

    public int getVp() {
        return vp;
    }

    public void setVp(int vp) {
        this.vp = vp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public int getVr() {
        return vr;
    }

    public void setVr(int vr) {
        this.vr = vr;
    }

    public int getMr() {
        return mr;
    }

    public void setMr(int mr) {
        this.mr = mr;
    }

}
