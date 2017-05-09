import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Sphere sphere = new Sphere();
        Cube cube = new Cube();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Įveskite kubo kraštinės ilgį a:");
        cube.setA(reader.nextInt());
        System.out.println("Įveskite rutulio skersmenį b:");
        sphere.setRadius(reader.nextInt()/2);
        System.out.println("Kubo tūris: " +decimalFormat.format(cube.getVolume()));
        System.out.println("Rutulio tūris: "+decimalFormat.format(sphere.getVolume()));
        double diference = cube.getVolume()-sphere.getVolume();
        System.out.println("Vandens tūris: "+decimalFormat.format(diference));


    }
}
