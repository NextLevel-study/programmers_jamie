package level1;

public class 행렬의덧셈 {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        int[][] result = solution(arr1, arr2);
        for (int[] i : result) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int width = arr1[0].length;
        int height = arr1.length;

        int[][] answer = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
