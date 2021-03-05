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

			if (str.substring(i, i + 3).equals("cat")) {cnt_cat++;}

			if (str.substring(i, i + 3).equals("dog")) {cnt_dog++;}
		}

		return cnt_cat == cnt_dog;
	}

}
