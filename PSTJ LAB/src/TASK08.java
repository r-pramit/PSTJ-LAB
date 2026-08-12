import java.util.*;

public class TASK08 {

    static boolean bfs(int src, int dest,
                       Map<Integer, List<Integer>> graph) {

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.add(src);
        visited.add(src);

        while (!q.isEmpty()) {

            int node = q.poll();

            if (node == dest)
                return true;

            for (int neighbor :
                    graph.getOrDefault(node, new ArrayList<>())) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < m; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        int src = sc.nextInt();
        int dest = sc.nextInt();

        System.out.println(bfs(src, dest, graph) ? "YES" : "NO");
    }
}