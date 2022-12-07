package lesson4;
//https://leetcode.com/problems/simplify-path/
// 71. Simplify Path

import java.util.Stack;

public class TaskThree {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        for (String s : split) {
            if (s.length() == 0 || s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.toString().length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home//foo////dir/"));
        System.out.println(simplifyPath("/home//foo/..//dir/"));
        System.out.println(simplifyPath("/../"));
    }
}
