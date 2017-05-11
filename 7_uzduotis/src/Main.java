import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        String string = scanner.nextLine();
        String[] splitString = string.split("\\s+");
        int[] numbers = new int[splitString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(splitString[i]);
        }
        triangle.setA(numbers[0]);
        triangle.setB(numbers[1]);
        triangle.setC(numbers[2]);
        System.out.println(triangle.evaluate());
        // write your code here
    }
}
