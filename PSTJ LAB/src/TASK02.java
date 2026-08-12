import java.util.*;
import java.util.stream.*;

public class TASK02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Double> avgMap =
                IntStream.range(0, n)
                        .mapToObj(i -> {
                            String id = sc.next();
                            int temp = sc.nextInt();
                            return new AbstractMap.SimpleEntry<>(id, temp);
                        })
                        .filter(e -> e.getValue() > 50)
                        .collect(Collectors.groupingBy(
                                Map.Entry::getKey,
                                Collectors.averagingInt(Map.Entry::getValue)
                        ));

        avgMap.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e ->
                        System.out.println(e.getKey() + " " + e.getValue()));
    }
}