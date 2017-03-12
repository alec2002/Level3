import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Survey implements ActionListener {
	HashMap<String, String> students = new HashMap<String, String>();
	int left = 0;
	int right = 0;
	 JFrame frame;
	 JPanel panel;
	 JButton survey;
	 JButton calc;
public static void main(String[] args) {
	Survey x = new Survey();
}
Survey(){
	frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setSize(500, 200);
	
	panel = new JPanel();
	
	survey = new JButton("Survey");
	calc = new JButton("Calculate");
	
	panel.add(calc);
	panel.add(survey);
	
	frame.add(panel);
	
	calc.addActionListener(this);
	survey.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == survey) {
		String name = JOptionPane.showInputDialog("What is your name?");
		String lf = JOptionPane.showInputDialog("Are you left or right handed?");
		students.put(name, lf);
		if (lf.equals("left")) {
			left +=1;
		}
		if (lf.equals("right")) {
			right +=1;
		}
	}
	if (e.getSource() == calc) {
		JOptionPane.showMessageDialog(null, "The ration of left to right handed people is " + left + ":" + right );
	}
	System.out.println(students);
	
}
}
