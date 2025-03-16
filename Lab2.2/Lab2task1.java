import java.util.Scanner;
import java.lang.Math;

public class Lab2task1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Запиши приклад");
        double a=scanner.nextDouble();
        scanner.close();
        double z1 = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * a), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * a), 2);

        System.out.println("z1 = " + z1);
        double z2=(1.0/4.0)-1.0/4.0*Math.sin(5.0/3.0*Math.PI-8*a);
        System.out.println("z2 = " + z2);
    }
    
}
