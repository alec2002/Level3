import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.Messaging.SyncScopeHelper;


public class NameList implements ActionListener {
	String sss = "";
	ArrayList<String> list = new ArrayList<String>();
	String jop = " ";
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
public static void main(String[] args) {
	NameList x = new NameList();
}
NameList(){
	frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setSize(500, 500);
	
	panel = new JPanel();
	
	b1 = new JButton("AddName");
	b1.setSize(100, 100);
	b2 = new JButton("Display");
	b2.setSize(100, 100);
	
	panel.add(b1);
	panel.add(b2);
	frame.add(panel);
	b1.addActionListener(this);
	b2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	if (arg0.getSource() == b1) {
		jop = JOptionPane.showInputDialog("Enter Name");
		list.add(jop);
	}
	if (arg0.getSource() == b2) {
		for (String s: list) {
			sss += s+'\n';
			
		}
		JOptionPane.showMessageDialog(null,sss);
	}
	
}
}
