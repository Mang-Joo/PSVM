package programmers;

public class IDRecommendation {
    public static void main(String[] args) {
        String solution = IDRecommendation.solution("=.=");
        System.out.println("solution = " + solution);
    }

    static public String solution(String new_id) {
        String s = new_id.toLowerCase();
        String match = "[^\\da-z\\-_.]";
        StringBuilder replace = new StringBuilder(s.replaceAll(match, "").replaceAll("\\.{2,}", "."));

            if (replace.charAt(0) == '.') {
                replace = new StringBuilder(replace.deleteCharAt(0));
            } else if (replace.charAt(replace.length() - 1) == '.') {
                replace = new StringBuilder(replace.deleteCharAt(replace.length() - 1));
            }
        if (replace.length() == 0) {
            replace.append("a");
        }
        if (replace.length() > 15) {
            replace.delete(15, replace.length());
        }
        if (replace.charAt(replace.length() - 1) == '.') {
            replace = new StringBuilder(replace.deleteCharAt(replace.length() - 1));
        }
        while (replace.length() < 3) {
            replace.append(replace.charAt(replace.length() - 1));
        }


        return replace.toString();
    }
}
