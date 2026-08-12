import java.util.*;
import java.util.stream.*;

public class TASK01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        salaries.stream()
                .map(salary -> (int)(salary * 1.1))
                .forEach(s -> System.out.print(s + " "));
    }
}