import level1.소수찾기;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 소수찾기Test {

    @Test
    void solution() {
        소수찾기 cls = new 소수찾기();

        Assertions.assertEquals(4, cls.solution(10));
        Assertions.assertEquals(3, cls.solution(4));
    }
}
