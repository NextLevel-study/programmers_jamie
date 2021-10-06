package level1;

public class 문자열다루기기본 {

    public boolean solution(String s) {
        int length = s.length();

        if (length != 4 && length != 6) {
            return false;
        }

        return s.chars().allMatch((c) -> {
            if (c >= 48 && c <= 71) {
                return true;
            }

            return false;
        });
    }
}
