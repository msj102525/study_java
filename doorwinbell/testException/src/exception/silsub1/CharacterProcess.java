package exception.silsub1;

public class CharacterProcess {
    public CharacterProcess() {
    }

    public int countAlpha(String s) throws CharCheckException {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                count++;
            } else if (Character.isWhitespace(s.charAt(i))) {
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            }
        }

        return count;
    }
}
