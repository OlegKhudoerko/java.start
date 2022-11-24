package lesson1;

public class TaskFour {
    public String reverseWords(String s) {
        String result = "";
        int end = s.length() - 1;
        int start = 0;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        start = end + 1;
        while (end >= 0 && s.charAt(end) != ' ') {
            end--;
        }
        result += s.substring(end + 1, start);

        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            start = end + 1;
            if (start == 0) {
                return result;
            }
            result += " ";
            while (end >= 0 && s.charAt(end) != ' ') {
                end--;
            }
            result += s.substring(end + 1, start);
        }
        return result;
    }
}



