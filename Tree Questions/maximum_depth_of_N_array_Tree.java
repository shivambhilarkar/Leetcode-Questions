import java.util.ArrayDeque;
import java.util.List;

public class maximum_depth_of_N_array_Tree {

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    class Solution {
        public int maxDepth(Node root) {
            if (root == null)
                return 0;
            int level_counter = 0;
            ArrayDeque<Node> queue = new ArrayDeque<>();
            queue.add(root);

            while (queue.isEmpty() == false) {

                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Node temp = queue.remove();
                    queue.addAll(temp.children);
                }
                level_counter += 1;
            }
            return level_counter;
        }
    }

}
