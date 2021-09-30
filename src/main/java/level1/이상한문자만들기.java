package level1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 이상한문자만들기 {

    public static void main(String[] args) {
        System.out.println(solution1("try hello world  "));
        System.out.println(solution2("try hello world  "));
    }

    private static String solution2(String s) {
        char[] chars = s.toCharArray();

        int size = chars.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (chars[i] == ' ') {
                count = 0;
                continue;
            }

            if (count % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }

            count++;
        }

        return String.valueOf(chars);
    }


    private static String solution1(String s) {
        String[] words = s.split(" ", -1);

        return Arrays.stream(words)
                .map(이상한문자만들기::changeWord)
                .collect(Collectors.joining(" "));
    }

    private static String changeWord(String word) {
        char[] chars = word.toCharArray();

        return IntStream.range(0, word.length())
                .mapToObj(i -> {
                    if (i % 2 == 0) {
                        return Character.toUpperCase(chars[i]);
                    }

                    return Character.toLowerCase(chars[i]);
                })
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
