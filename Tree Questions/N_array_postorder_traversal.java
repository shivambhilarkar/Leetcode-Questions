public class N_array_postorder_traversal {
    /*
     * // Definition for a Node. class Node { public int val; public List<Node>
     * children;
     * 
     * public Node() {}
     * 
     * public Node(int _val) { val = _val; }
     * 
     * public Node(int _val, List<Node> _children) { val = _val; children =
     * _children; } };
     */

    class Solution {
        public List<Integer> postorder(Node root) {
            ArrayList<Integer> list = new ArrayList<>();
            postorder_traversal(root, list);
            return list;
        }

        public void postorder_traversal(Node root, ArrayList<Integer> list) {
            if (root == null) {
                return;
            }
            for (int i = 0; i < root.children.size(); i++) {
                postorder_traversal(root.children.get(i), list);
            }
            list.add(root.val);
        }
    }

}
