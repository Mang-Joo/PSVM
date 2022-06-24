package programmers;

public class EnglishWords {
    public static void main(String[] args) {
        EnglishWords englishWords = new EnglishWords();
        int one4seveneight = englishWords.solution("1zerotwozero3");
        System.out.println("one4seveneight = " + one4seveneight);
    }

    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        for (int i = 0; i < strArr.length; i++) {
            s = s.replace(strArr[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
