package level1;

import java.util.stream.LongStream;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        for (long i : solution(x, n)) {
            System.out.println(i);
        }
    }

    private static long[] solution(int x, int n) {
        return LongStream.range(1, n + 1)
                .map(i -> i * x)
                .toArray();
    }
}
