import level1.소수찾기;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 소수찾기Test {

    @Test
    void solution() {
        소수찾기 cls = new 소수찾기();

        assertEquals(4, cls.solution(10));
        assertEquals(3, cls.solution(5));
    }

    @Test
    void isPrimeNumber() {
        소수찾기 cls = new 소수찾기();

        assertEquals(false, cls.isPrimeNumber(1));
        assertEquals(true, cls.isPrimeNumber(2));
        assertEquals(true, cls.isPrimeNumber(3));
        assertEquals(false, cls.isPrimeNumber(10));
    }
}
