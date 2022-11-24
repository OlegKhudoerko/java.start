package lesson1;

public class TaskFour {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder("");
        int end = s.length() - 1;
        int start = 0;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        start = end + 1;
        while (end >= 0 && s.charAt(end) != ' ') {
            end--;
        }
        result.append(s.substring(end + 1, start));

        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            start = end + 1;
            if (start == 0) {
                return result.toString();
            }
            result.append(" ");
            while (end >= 0 && s.charAt(end) != ' ') {
                end--;
            }
            result.append(s.substring(end + 1, start));
        }
        return result.toString();
    }
}
