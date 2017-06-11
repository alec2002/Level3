import java.util.ArrayList;


public class words {
	String character;
	String correctAnswer;
	ArrayList<Character> wordschar= new ArrayList<Character>();
public words(String w){
	correctAnswer = w;
	for (int i = 0; i < w.length(); i++) {
		wordschar.add('_');
		
	}
	
}
//can't use w 
	String getDisplayedWord(){
		for (int i = 0; i < w.length(); i++) {
			wordschar.get(i);
			
		}
		return "___";
	}

	

}
