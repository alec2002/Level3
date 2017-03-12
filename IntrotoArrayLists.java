import java.util.ArrayList;


public class IntrotoArrayLists {
ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		IntrotoArrayLists x = new IntrotoArrayLists();
	}
	IntrotoArrayLists(){
		list.add("Alec");
		list.add("tutle");
		list.add("hair");
		for (String s: list) {
			System.out.println(s);
		}
	}
	
}
