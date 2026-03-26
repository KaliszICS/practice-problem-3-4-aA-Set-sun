public class PracticeProblem {

	public static void main(String args[]) {

	}

		public static int min (int num1, int num2, int num3) {
		int lower;
		if (num1 > num2) {
			lower = Math.min(num2, num3);
			return lower;

		}
		else {
			lower = Math.min(num1, num3);
			return lower;

		}
	}

	public static boolean isLeapYear (int year) {

		if (year % 4 == 0) { //step 1
			if (year % 100 == 0) { //step 2
				if (year % 400 == 0) { //step 3 -> 5
					return true;
				}
				else { //step 3 -> 4
					return false;
				}
			}
			else { //step 2 -> 5
				return true;
			}
		}
		else { //step 1 -> 4
			return false;
		}
	}

}
