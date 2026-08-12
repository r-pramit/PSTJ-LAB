import java.util.*;

public class TASK04 {

    static void KMPSearch(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        int[] lps = new int[m];
        computeLPS(pattern, lps);

        int i = 0, j = 0;

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.print((i - j) + " ");
                j = lps[j - 1];
            }

            else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
    }

    static void computeLPS(String pat, int[] lps) {
        int len = 0;
        int i = 1;

        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        KMPSearch(text, pattern);
    }
}