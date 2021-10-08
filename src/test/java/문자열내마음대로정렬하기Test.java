import level1.문자열내마음대로정렬하기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 문자열내마음대로정렬하기Test {

    @Test
    void solution() {
        문자열내마음대로정렬하기 cls = new 문자열내마음대로정렬하기();
        String[] words = {"sun", "bed", "car"};
        String[] resultWords1 = {"car", "bed", "sun"};
        String[] resultWords2 = {"bed", "sun", "car"};

        assertArrayEquals(resultWords1, cls.solution(words, 1));
        assertArrayEquals(resultWords2, cls.solution(words, 2));
    }
}
