package level1;

import java.util.stream.IntStream;

public class 소수찾기 {

    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> isPrimeNumber(i))
                .count();
    }

    private static boolean isPrimeNumber(int number) {
        return true;
    }
}
