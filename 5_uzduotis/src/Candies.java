/**
 * Created by Minde on 2017.05.09.
 */
public class Candies {
    private int a;
    private int b;
    private int coupon;
    private int bags;


    public int calculate() {
        int i = 1;
        if (a > 0) {
            while (b >= a) {
                bags += b / a;
                coupon += bags;
                b -= bags * a;
                while (coupon >= 3 && i <= 3) {
                    int tempCoupons = coupon/3;
                    bags+=tempCoupons;
                    coupon -= tempCoupons*3;
                    coupon+=tempCoupons;
                    i++;
                }
            }
            return bags;
        }
        return 0;
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
}
