import java.util.HashMap;


public class Hm {
	HashMap<Integer, String> studentList = new HashMap<Integer, String>();
public static void main(String[] args) {
	Hm x = new Hm();
}
Hm(){
	studentList.put(1, "Randy");
	studentList.put(88, "Tim");
	studentList.put(34, "Rob");
	studentList.put(10, "Alec");
	studentList.put(7, "Evan");
	studentList.put(105, "Juan");
	for (String s: studentList.values()) {
		System.out.println(s);
	}
}
}
