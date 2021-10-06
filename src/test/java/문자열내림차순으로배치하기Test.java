import level1.문자열내림차순으로배치하기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 문자열내림차순으로배치하기Test {

    @Test
    void solution() {
        문자열내림차순으로배치하기 cls = new 문자열내림차순으로배치하기();

        assertEquals("gfedcbZ", cls.solution("Zbcdefg"));
    }
}
