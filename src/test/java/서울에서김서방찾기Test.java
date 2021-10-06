import level1.서울에서김서방찾기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 서울에서김서방찾기Test {

    서울에서김서방찾기 cls = new 서울에서김서방찾기();

    @Test
    void solution() {
        String[] seoul = {"Jane", "Kim"};

        assertEquals("김서방은 1에 있다", cls.solution(seoul));
    }

    @Test
    void findKimLocation() {
        String[] seoul = {"Kim", "Jane"};
        String[] seoul1 = {"Jane", "Kim"};
        String[] seoul2 = {"Someone", "Jane", "Kim"};

        assertEquals(0, cls.findKimLocation(seoul));
        assertEquals(1, cls.findKimLocation(seoul1));
        assertEquals(2, cls.findKimLocation(seoul2));
    }
}
