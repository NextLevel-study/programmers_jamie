package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 문자열내림차순으로배치하기 {

    public String solution(String s) {
        String[] words = s.split("");
        return Arrays.stream(words)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
    }
}
