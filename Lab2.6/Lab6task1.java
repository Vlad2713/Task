import java.util.Scanner;

public class Lab6task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок для перевірки:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Це паліндром.");
        } else {
            System.out.println("Це не паліндром.");
        }
    }

    public static boolean isPalindrome(String text) {
        // Очищаємо текст: залишаємо тільки літери, знижуємо регістр
        String cleaned = text.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

        // Порівнюємо очищений рядок з його реверсом
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
