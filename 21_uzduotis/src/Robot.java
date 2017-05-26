/**
 * Created by Minde on 2017.05.26.
 */
public class Robot {
    private int x;
    private int y;

    public void move(char charMove){
        if (charMove=='a'&&x>-100){
            x--;
        }
        if (charMove=='p'&&x<100){
            x++;
        }
        if (charMove=='k'&&y<100){
           y++;
        }
        if (charMove=='d'&&y>-100){
            y--;
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x +" " + y;
    }
}
