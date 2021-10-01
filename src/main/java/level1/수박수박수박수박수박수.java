package level1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 수박수박수박수박수박수 {

    public String solution(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> {
                    if (i % 2 == 0) {
                        return "박";
                    }

                    return "수";
                })
                .collect(Collectors.joining());
    }
}
