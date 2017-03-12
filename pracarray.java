import java.util.ArrayList;

import javax.swing.JOptionPane;


public class pracarray {
	String in = " ";
	ArrayList<String> l = new ArrayList<String>();
public static void main(String[] args) {
	pracarray x = new pracarray();
}
pracarray(){

	while(!in.equals("")){
		 in = JOptionPane.showInputDialog("Enter some strings");
		l.add(in);
	}
	for (String s: l) {
		System.out.println(s);
	}
}
}
