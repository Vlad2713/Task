import java.util.Scanner;

public class Lab6task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String input = scanner.nextLine();

        String result = input.replace("th", "");
        System.out.println("Результат після видалення \"th\":");
        System.out.println(result);
    }
}
