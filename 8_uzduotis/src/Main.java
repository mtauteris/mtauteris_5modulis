import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boxes boxes = new Boxes();
boxes.sort(scanner.nextLine());
        System.out.println(boxes.evaluate());
        // write your code here
    }
}
