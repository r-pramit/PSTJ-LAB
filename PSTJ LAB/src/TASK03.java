import java.util.*;

public class TASK03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxSoFar = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            current = Math.max(x, current + x);
            maxSoFar = Math.max(maxSoFar, current);
        }

        System.out.println(maxSoFar);
    }
}