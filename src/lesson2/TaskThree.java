
package lesson2;


public class TaskThree {

    public static void main(String[] args) {

    }

//    public static List<String> binaryTreePaths(TreeNode root) {
//        List<String> paths = new ArrayList<>();
//        if (root == null) return paths;
//        StringBuilder sb = new StringBuilder();
//        dfs(root, paths, sb);
//        return paths;
//    }
//
//    private static void dfs(TreeNode root, List<String> ans, StringBuilder sb) {
//        if (root.left == null && root.right == null) {
//            sb.append(root.val);
//            ans.add(sb.toString());
//            return;
//        }
//        sb.append(root.val + "->");
//        if (root.left != null) {
//            dfs(root.left, ans, new StringBuilder(sb.toString()));
//        }
//        if (root.right != null) {
//            dfs(root.right, ans, new StringBuilder(sb.toString()));
//        }
//    }
}
