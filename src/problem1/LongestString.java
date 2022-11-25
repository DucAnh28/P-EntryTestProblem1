package problem1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        System.out.println(getLongestString(input));
    }

    public static String getLongestString(String input) {
        String word = "";
        String[] words = new String[80];
        int length = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word = word + input.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }
        String large = words[0];
        for (int k = 0; k < length; k++) {
            if (large.length() < words[k].length())
                large = words[k];
        }
        return large;
    }

}
