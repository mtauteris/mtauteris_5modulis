import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Minde on 2017.05.26.
 */
public class Reader {

    private static final String FILENAME = "C:\\Users\\Minde\\Desktop\\MT_github\\mtauteris_5modulis\\21_uzduotis\\robots.txt";
    Robot robot = new Robot();
    Robot robot1 = new Robot();
    FileReader fr = null;
    BufferedReader br = null;
    private int[] coordinates = new int[5];
    private char[] moves;

    public void play() {
        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                String[] temp = sCurrentLine.split(" ");
                for (int i = 0; i < temp.length; i++) {
                    coordinates[i] = Integer.parseInt(temp[i]);
                    moves = new char[coordinates[4]];
                }
                robot.setX(getCoordinates()[0]);
                robot.setY(getCoordinates()[1]);
                robot1.setX(getCoordinates()[2]);
                robot1.setY(getCoordinates()[3]);
                sCurrentLine = br.readLine();
                moves = sCurrentLine.toLowerCase().toCharArray();

                int j = 0;
                while (j < getMoves().length) {
                    robot.move(getMoves()[j]);
                    if (robot.getX() == robot1.getX() && robot.getY() == robot1.getY()) {
                        System.out.print("AVARIJA ");
                        break;
                    }
                    robot1.move(getMoves()[j + 2]);
                    if (robot.getX() == robot1.getX() && robot.getY() == robot1.getY()) {
                        System.out.print("AVARIJA ");
                        break;
                    }
                    j += 4;
                }
                position();
            }


        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    public void position() {
        System.out.print(robot.toString());
        System.out.print(" ");
        System.out.println(robot1.toString());
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public char[] getMoves() {
        return moves;
    }

    public void setMoves(char[] moves) {
        this.moves = moves;
    }
}

