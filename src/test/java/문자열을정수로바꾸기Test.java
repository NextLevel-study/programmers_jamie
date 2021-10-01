import level1.문자열을정수로바꾸기;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 문자열을정수로바꾸기Test {

    @Test
    void solution() {
        문자열을정수로바꾸기 cls = new 문자열을정수로바꾸기();

        Assertions.assertEquals(1234, cls.solution("+1234"));
        Assertions.assertEquals(-1234, cls.solution("-1234"));
    }
}
