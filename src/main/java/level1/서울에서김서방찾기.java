package level1;

public class 서울에서김서방찾기 {

    public String solution(String[] seoul) {
        int kimLocation = findKimLocation(seoul);
        return "김서방은 " + kimLocation + "에 있다";
    }

    public int findKimLocation(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return i;
            }
        }
        
        return -1;
    }
}
