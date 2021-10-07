package level1;

public class 문자열내p와y의개수 {

    public boolean solution(String s) {
        char[] alphabets = s.toLowerCase().toCharArray();
        int pCount = getAlphabetCount(alphabets, 'p');
        int yCount = getAlphabetCount(alphabets, 'y');

        return pCount == yCount;
    }

    private int getAlphabetCount(char[] alphabets, char alphabet) {
        int count = 0;
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] == alphabet) {
                count++;
            }
        }
        return count;
    }
}
