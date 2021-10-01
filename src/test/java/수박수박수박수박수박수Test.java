import level1.수박수박수박수박수박수;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 수박수박수박수박수박수Test {

    @Test
    void solution() {
        수박수박수박수박수박수 cls = new 수박수박수박수박수박수();

        assertEquals("수박수", cls.solution(3));
        assertEquals("수박수박", cls.solution(4));
    }
}
