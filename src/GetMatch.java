import java.util.HashMap;


public class GetMatch {
	
	HashMap<String,String> h1 = new HashMap<String, String>();
	HashMap<String, String> h2 = new HashMap<String, String>();
	
public static void main(String[] args) {
	GetMatch x = new GetMatch();
}
GetMatch(){
	
	
	
	h1.put("Joe", "Tim");
	h1.put("Alec", "Bob");
	h2.put("Joe", "Tim");
	h2.put("Alec", "Bob");
	
	int x = getMatchingPairs(h1, h2);
	System.out.println(x);
}
int getMatchingPairs(HashMap<String,String> m1, HashMap<String, String> m2){
	int keeptrack = 0;
	for (String s : h1.keySet()) {
		String h22 = h2.get(s);
		if (h22.equals(h1.get(s))) {
			keeptrack++;
		}
		
	}
	
	return keeptrack;
	
}
}
