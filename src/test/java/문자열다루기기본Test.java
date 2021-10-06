import level1.문자열다루기기본;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 문자열다루기기본Test {

    @Test
    void solution() {
        문자열다루기기본 cls = new 문자열다루기기본();

        assertEquals(false, cls.solution("a234"));
        assertEquals(true, cls.solution("1234"));
        assertEquals(true, cls.solution("123456"));
        assertEquals(false, cls.solution("12345"));
    }
}
