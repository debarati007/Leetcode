import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String args[]) {

    }

    public static ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean vis[] = new boolean[v + 1];

        for (int i = 1; i <= v; i++) {
            if (!vis[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                vis[i] = true;

                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    bfs.add(node);
                    for (Integer it : adjList.get(node)) {
                        if (!vis[it]) {
                            vis[it] = true;
                            queue.add(it);
                        }
                    }
                }
            }
        }
        return bfs;
    }

}
