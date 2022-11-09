import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String s = scanner.nextLine();
        s=s.toUpperCase();
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)<'A'||s.charAt(i)>'Z'){
                continue;
            }
            array[s.charAt(i)-'A']+=1;
        }
        for (int i = 0; i < 26; i++) {
            if (array[i]==0){
                continue;
            }
            System.out.print((char) ('A'+i));
            System.out.print("    ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
