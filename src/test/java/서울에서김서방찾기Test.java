import level1.서울에서김서방찾기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 서울에서김서방찾기Test {

    @Test
    void solution() {
        String[] seoul = {"Jane", "Kim"};
        서울에서김서방찾기 cls = new 서울에서김서방찾기();

        assertEquals("김서방은 1에 있다", cls.solution(seoul));
    }
}
