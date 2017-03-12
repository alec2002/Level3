
import java.util.ArrayList;
import java.util.List;


public class Algorithm {

public static void main(String[] args) {
	Algorithm x = new Algorithm();
}
Algorithm(){
	
}
static public int findBrokenEgg(List<String> c){
	 int num = 0;
	for (String e : c) {

	
		if (e.equals("cracked")) {
			
			return num;
			
		}
		num += 1;
	}
	return num;
	
}
static public int countPearls(List<Boolean> c){
	int num2 = 0;
	for (Boolean d: c) {
		
		if (d.equals(true)) {
			num2 += 1;
		}
	}
	return num2;
}
static public double findTallest(List<Double> c){
	Double num2 = 0.0;
	for (Double dd: c) {
		
		if (dd > num2) {
			num2 = dd;
		}
		
	}
	return num2;
	
}
static public String findLongestWord(List<String> c){
	 String a = "a";
	for (String ee : c) {
if (ee.length() > a.length() ) {
	a = ee;
}

}
	return a;
}
static public Boolean containsSOS(List<String> c){
	String Sos = "... --- ...";
	for (String rr : c) {
		if (rr.contains(Sos)) {
			return true;
		}
	
	}
	return false;
}
static public List<Double> sortScores(List<Double> c){
	
	for (int i = 0; i < c.size(); i++) {
		for (int j = i + 1; j < c.size(); j++) {
			if (c.get(i) > c.get(j)) {
				double t = c.get(i);
				c.set(i, c.get(j));
				c.set(j, t);
				
			}
		}
		
	}

	return c;
	
	}
static public List sortDNA(List<String> us) {
	
for (int i = 0; i < us.size(); i++) {
	for (int j = i + 1; j < us.size(); j++) {
		if (us.get(i).length() > us.get(j).length()){
			String t = us.get(i);
			us.set(i, us.get(j));
			us.set(j, t);
		}
	}
}
return us;
}
public static List<String> sortWords(List<String> words) {
	for (int i = 0; i < words.size(); i++) {
		for (int j = 0 + 1; j < words.size(); j++) {
			if (words.get(i).compareTo(words.get(j)) < 0) {
				String t = words.get(i);
				words.set(i, words.get(j));
				words.set(j, t);
			}
			
		}
	}
	return words;
}

}

