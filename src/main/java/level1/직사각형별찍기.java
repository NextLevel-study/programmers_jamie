package level1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 직사각형별찍기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        String star = "*";

        StringBuilder stars = new StringBuilder();
        IntStream.range(0, width).forEach(i -> stars.append(star));

        for (int i = 0; i < height; i++) {
            System.out.println(stars);
        }
    }
}
