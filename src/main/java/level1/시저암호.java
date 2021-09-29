package level1;

import java.util.stream.Collectors;

public class 시저암호 {

    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    private static String solution(String s, int n) {
        return s.chars()
                .mapToObj(ch -> {
                    if (Character.isLowerCase(ch)) {
                        int distance = (ch - 'a' + n) % 26;
                        return (char) ('a' + distance);
                    }

                    if (Character.isUpperCase(ch)) {
                        int distance = (ch - 'A' + n) % 26;
                        return (char) ('A' + distance);
                    }

                    return (char) ch;
                })
                .map(ch -> ch.toString())
                .collect(Collectors.joining());
    }
}
