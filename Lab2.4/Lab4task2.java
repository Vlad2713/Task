public class Lab4task2 {
    public static void main(String[] args) {
       
        double[] A = {1.2, 3.5, 2.1, 5.7, 4.4, 6.0, 3.3, 4.1};

        int count = 0;

        
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                count++;
            }
        }

        System.out.println("Кількість елементів, більших за сусідів: " + count);
    }
}
