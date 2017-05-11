import java.util.Arrays;

/**
 * Created by Minde on 2017.05.11.
 */
public class Boxes {
    private int a1;
    private int b1;
    private int c1;
    private int a2;
    private int b2;
    private int c2;

    public String evaluate() {
        if (a1 == a2 && b1 == b2 && c1 == c2) {
            return "Abi vienodų matmenų";
        } else if ((a1 >= a2 && b1 >= b2 && c1 >= c2)) {
            return "Antra dėžute telpa pirmoje";
        } else if (a1 <= a2 && b1 <= b2 && c1 <= c2) {
            return "Pirma dėžute telpa antroje";
        } else {
            return "Dėžutės nepalyginamos";
        }
    }

    public void sort(String string) {
        String[] splitString = string.split("\\s+");
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        for (int i = 0; i < 3; i++) {
            box1[i] = Integer.parseInt(splitString[i]);
            box2[i] = Integer.parseInt(splitString[i + 3]);
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        setA1(box1[0]);
        setB1(box1[1]);
        setC1(box1[2]);
        setA2(box2[0]);
        setB2(box2[1]);
        setC2(box2[2]);
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }
}
