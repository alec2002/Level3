import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SimplTextEditor implements KeyListener {

	String type = "";
	Stack<Character> cc = new Stack<Character>();
	JFrame frame;
	JPanel panel;
	JLabel text;

	public static void main(String[] args) {
		SimplTextEditor x = new SimplTextEditor();
	}

	SimplTextEditor() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 500);

		panel = new JPanel();

		text = new JLabel();

		panel.add(text);
		frame.add(panel);
		frame.addKeyListener(this);

	}

	@Override
	public void keyPressed(KeyEvent arg0) {

		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			if (type.length() > 0) {
				
			
			char c = type.charAt(type.length() - 1);
			cc.push(c);
			type = type.substring(0, type.length() - 1);
			text.setText(type);
			}
		}
		if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {

type += cc.pop();
text.setText(type);
			
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		char cha = arg0.getKeyChar();
		type += cha;
		text.setText(type);

	}

}
