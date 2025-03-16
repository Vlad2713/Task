import java.util.Scanner;
import java.lang.Math;

public class Lab2task2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введіть значення x");
        double x=scanner.nextDouble();
        System.out.println("Введіть значення t");
        double t=scanner.nextDouble();
        System.out.println("Введіть значення b");
        double b=scanner.nextDouble();
        scanner.close();
        

        double a = 0.73*t-Math.sin(x);
        if(a>0){
            double p=2.45*Math.pow(x,2)+ Math.exp(-x*a);
            System.out.println("Відповідь до приклада p="+ p);

        }
        else{
          double p=(Math.sqrt(a+b))/Math.log(Math.pow(a, 2)+Math.pow(b, 2));
          System.out.println("Відповідь до приклада p="+ p);
        }
        

    }

    
}
