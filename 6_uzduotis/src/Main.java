import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bus bus  = new Bus();
        System.out.print("Kada autobusas išvyko iš Vilniaus? ");
        bus.setVi(scanner.nextInt());
        bus.setMi(scanner.nextInt());
        System.out.print("Kiek laiko autobusas važiavo iš Vilniaus į Panevėžį? ");
        bus.setVp(scanner.nextInt());
        bus.setMp(scanner.nextInt());
        System.out.print("Kelias minutes autobusas stovjėjo Panevėžyje? ");;
        bus.setMs(scanner.nextInt());
        System.out.print("Kiek laiko autobusas važiavo iš Panevėžio į Rygą? ");
        bus.setVr(scanner.nextInt());
        bus.setMr(scanner.nextInt());
        System.out.println("Autobusas į Rygą atvyks: "+bus.calculate());
        // write your code here
    }
}
