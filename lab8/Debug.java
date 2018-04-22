import java.util.Arrays;
import java.util.Scanner;

public class Debug extends Main implements Main.Command {
    public void execute() {
        System.out.println("Debug mode on!");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = in.nextLine();
        System.out.println("***Text entered***");
        final String sentences[] = text.split("[.!?]\\s*");

        final String words[][] = new String[sentences.length][];

        for (int i = 0; i < sentences.length; ++i)

        {
            words[i] = sentences[i].split("[\\p{Punct}\\s]+");
        }

        System.out.print(Arrays.deepToString(words));
        System.out.println(" ");
        System.out.println("***Sentences are divided***");
        int i = 0, j = 0;
        int n = 0;
        int a = 0;
        int b = 0;

        while (j < text.length())

        {
            while (text.charAt(i) != ' ') {
                i++;
            }
            b = i;
            if (text.charAt(a) == text.charAt(b - 1))

                for (int k = a; k <= b - 1; k++) {
                    System.out.print(text.charAt(k));
                    if (k == b - 1)
                        System.out.println();
                }
            a = b + 1;
            j = b + 1;
            i++;
        }
        System.out.println("***Words are printed***");
    }
}