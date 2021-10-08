package level1;

import java.util.Comparator;
import java.util.stream.Stream;

public class 문자열내마음대로정렬하기 {

    public String[] solution(String[] strings, int n) {
        return Stream.of(strings)
                .sorted()
                .sorted(Comparator.comparingInt(word -> word.charAt(n)))
                .toArray(String[]::new);
    }
}
