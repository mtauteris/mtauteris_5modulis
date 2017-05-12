import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       final String[] roads = {"a","b","c","d","e","f"};
        Scanner scanner = new Scanner(System.in);
        Road road = new Road();
        for (int i=0;i<6;i++){
            System.out.print("Ar galima važiuoti keliu "+roads[i]+"? ");
            switch (i){
                case 0:
                    road.setA(road.revert(scanner.nextInt()));
                break;
                case 1:
                    road.setB(road.revert(scanner.nextInt()));
                break;
                case 2:
                    road.setC(road.revert(scanner.nextInt()));
                    break;
                case 3:
                    road.setD(road.revert(scanner.nextInt()));
                    break;
                case 4:
                    road.setE(road.revert(scanner.nextInt()));
                    break;
                case 5:
                    road.setF(road.revert(scanner.nextInt()));
                    break;
                    default:
                        System.out.println("Klaida");
                        break;
            }
        }
        System.out.println(road.evaluate());

        // write your code here
    }
}
