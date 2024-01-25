package exception.silsub1;

public class NumberProcess {
	public NumberProcess() {
	}

	public boolean checkDouble(int a, int b) throws NumberRangeException {
		if (a >= 1 || a <= 100 && b >= 1 && b >= 100) {
			if (a % b == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			throw new NumberRangeException("1~100 사이의 값이 아님.");
		}

	}
}
