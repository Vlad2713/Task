import java.util.Scanner;
import java.lang.Math;

public class Lab2task3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введіть значення z");
        double z=scanner.nextDouble();
        System.out.println("Введіть значення b");
        double b=scanner.nextDouble();
        scanner.close();
        

        
        if(b<z/2){
            double x=2*z*b-Math.pow(b, 2);
            System.out.println("Відповідь до приклада x="+ x);

        }
        else{
          double x=Math.pow(z, 2)+Math.pow(b, 2);
          System.out.println("Відповідь до приклада x="+ x);
        }
        

    }

    
}
