import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String s = scanner.nextLine();
        String[] words = s.split("\s+");
        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse()+" ");

        }
    }
}
