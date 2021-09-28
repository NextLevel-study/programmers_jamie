package level1;

import java.util.stream.IntStream;

public class 약수의합 {

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(12));
        System.out.println(solution2(5));
        System.out.println(solution2(12));
        System.out.println(solution3(5));
        System.out.println(solution3(12));
    }

    private static int solution(int n) {
        return IntStream
                .rangeClosed(1, n)
                .reduce(0, (total, i) -> {
                    if (n % i != 0) {
                        return total;
                    }

                    return total + i;
                });
    }

    private static int solution2(int n) {
        return IntStream
                .rangeClosed(1, n / 2)
                .reduce(n, (total, i) -> {
                    if (n % i != 0) {
                        return total;
                    }

                    return total + i;
                });
    }

    private static int solution3(int n) {
        return IntStream
                .rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .sum();
    }
}
