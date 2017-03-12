import java.util.HashMap;
import java.util.Random;

public class TestScore {
	int num;
	HashMap<String, Integer> grades = new HashMap<String, Integer>();
	Random r = new Random();
	Random ri = new Random();

	public static void main(String[] args) {
		TestScore x = new TestScore();
	}

	TestScore() {

		for (int i = 0; i < 100; i++) {
			int k = r.nextInt(5);
			int grade = r.nextInt(101);
			String key = "";
			if (k == 0) {
				key = "Science";

			} else if (k == 1) {
				key = "Math";
			} else if (k == 2) {
				key = "PE";
			} else if (k == 3) {
				key = "History";
			} else if (k == 4) {
				key = "English";
			}
			if (grades.keySet().contains(key)) {
				int g = grades.get(key);
				int num = (g + grade) / 2;
				grades.put(key, num);
				
			} else {
				grades.put(key, grade);
			}

		}
		for (String s : grades.keySet()) {
			System.out.println(s + ":" + "" + grades.get(s) + "%");
		}
	}
}
