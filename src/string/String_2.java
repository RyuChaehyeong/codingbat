package string;

public class String_2 {

	public String doubleChar(String str) {
		String[] split_char = str.split("");
		String doubleChar = "";
		for (int a = 0; a < str.length(); a++) {
			doubleChar += split_char[a];
			doubleChar += split_char[a];
		}

		return doubleChar;
	}

	// **
	public int countHi(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			String subs = str.substring(i, i + 2);
			if (subs.equals("hi")) {
				cnt++;
			}
		}

		return cnt;
	}

	public boolean catDog(String str) {

		int cnt_cat = 0;
		int cnt_dog = 0;

		for (int i = 0; i < str.length() - 2; i++) {

			if (str.substring(i, i + 3).equals("cat")) {
				cnt_cat++;
			}

			if (str.substring(i, i + 3).equals("dog")) {
				cnt_dog++;
			}
		}

		return cnt_cat == cnt_dog;
	}

	public int countCode(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
				cnt++;
			}
		}
		return cnt;
	}

	public boolean endOther(String a, String b) {
		String up_a = a.toUpperCase();
		String up_b = b.toUpperCase();

		return up_a.endsWith(up_b) || up_b.endsWith(up_a);
	}

	// **
	public boolean xyzThere(String str) {
		str = " " + str;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.')
				return true;
		}

		return false;
	}

	// 수정전: 이렇게 하면 반복문 한번에 메소드 끝나...
	public boolean bobThere_before(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			String subs = str.substring(i, i + 3);
			return subs.charAt(0) == 'b' && subs.endsWith("b");
		}

		return false;
	}

	// 수정후
	public boolean bobThere_after(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			String subs = str.substring(i, i + 3);
			if (subs.charAt(0) == 'b' && subs.endsWith("b")) {
				return true;
			}
		}

		return false;
	}

}
