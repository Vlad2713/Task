import java.util.Scanner;

public class Lab4task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 12; 
        int[] Arr = {0, 13, -5, 6, 3, 3, -2, 4, 2, 7, 12, -6}; 

        System.out.print("Input a number: " + num);
        int k = 3;
        int m = 2;

        System.out.print("\nArr=( ");
        for (int i = 0; i < num; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println(")");

       
        int min = Arr[0], ind = 0;
        for (int i = 1; i < num; i++) {
            if (Arr[i] < min) {
                min = Arr[i];
                ind = i;
            }
        }

        
        int nk = 0, nm = 0;
        for (int i = 0; i < num; i++) {
            if (Arr[i] > k) nk++;
            if (Arr[i] > 2 * m) nm++;
        }

        System.out.println("min= " + min);
        System.out.println(">k " + nk);
        System.out.println("ind= " + ind);
        System.out.println(">2*m= " + nm);
    }
}

