import level1.문자열내p와y의개수;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 문자열내p와y의개수Test {

    @Test
    void solution() {
        문자열내p와y의개수 cls = new 문자열내p와y의개수();

        assertEquals(true, cls.solution("pPoooyY"));
        assertEquals(false, cls.solution("Pyy"));
    }
}
