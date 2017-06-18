import java.util.ArrayList;


public class words {
	
	String wordcha;
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
		wordcha = "";
		for (int i = 0; i < correctAnswer.length(); i++) {
			wordcha += wordschar.get(i);
			
		}
		return wordcha;
	}
	void checkLetter(char c){
		System.out.println(c);
		for (int i = 0; i < wordschar.size(); i++) {
			
			if (correctAnswer.charAt(i) == c) {
				wordschar.set(i, c);
			}
			//else{
			
		//	}
		}
	}

	

}
