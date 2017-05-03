import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Apelsinas apelsinas = new Apelsinas();
        Scanner reader = new Scanner(System.in);
        System.out.println("Įveskite apelsino skersmenį: ");
        apelsinas.setA(reader.nextDouble());
        System.out.println("Įveskite apelsino žievelės storį: ");
        apelsinas.setD(reader.nextDouble());
        apelsinas.getTuris();
        System.out.println(apelsinas.getTuris());
    }
}
