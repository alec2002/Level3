import java.io.FileWriter;

import javax.swing.JOptionPane;


public class MessageEncrypter {
String file = "";
public static void main(String[] args) {
	MessageEncrypter x = new MessageEncrypter();
}
MessageEncrypter(){
	String ans = JOptionPane.showInputDialog("Message?");
	for (char c: ans.toCharArray()) {
		char cc = (char) (c + 10);
		file += cc;
	}
	try {
		FileWriter fww = new FileWriter("Encryp");
		fww.write(file);
		fww.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
