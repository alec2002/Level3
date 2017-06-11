import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Hangman {
	int x = 9;
	JFrame frame;
	JPanel panel;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	Stack<words> wordStack;
	words currentWord = new words("");
	//need to have words constructor and use that to call methods
public static void main(String[] args) {
	Hangman x = new Hangman();
}
Hangman(){
	wordStack = new Stack<words>();
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	
	label1 = new JLabel();
	label1.setText("Guess a letter");
	
	label2 = new JLabel();
	label2.setText("You have " + x + " Lives left");
	
	label3 = new JLabel();
	label3.setText(currentWord.getDisplayedWord());
	
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	frame.add(panel);
	
	//for(){
		String word = "Grape";
		words w = new words(word);
		wordStack.push(w);

//	}
}
void displayNextWord(){
	currentWord = wordStack.pop();
}
}
