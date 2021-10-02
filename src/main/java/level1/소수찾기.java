package level1;

import java.util.stream.IntStream;

public class 소수찾기 {

    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> isPrimeNumber(i))
                .count();
    }

    public static boolean isPrimeNumber(int number) {
        int squareRoot = (int) Math.sqrt(number);

        if (number == 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
