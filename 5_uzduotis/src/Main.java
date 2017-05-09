import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Candies candies = new Candies();
        System.out.print("Įveskite saldainių maišelio kainą :");
        candies.setA(reader.nextInt());
        System.out.print("Įveskite pinigų sumą saldainiams pirkti: ");
        candies.setB(reader.nextInt());
        System.out.println(candies.calculate());
        // write your code here
    }
}
