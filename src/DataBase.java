import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class DataBase implements ActionListener{
	HashMap<Integer, String> studentList = new HashMap<Integer, String>();
	String jop1 = "";
	String jop2 = "";
	String jop3 = "";
	String jopp1 = "";
	Integer joppp1;
	Integer joppp2;
	Integer joppp3;
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton SearchID;
	JButton SearchName;
	JButton ViewList;
public static void main(String[] args) {
	DataBase x = new DataBase();
}
DataBase(){
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500, 200);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	
	add = new JButton("ADD");
	SearchID = new JButton("SEARCH ID");
	SearchName = new JButton("SEARCH NAME");
	ViewList = new JButton("VIEW LIST");
	
	panel.add(add);
	panel.add(SearchID);
	panel.add(SearchName);
	panel.add(ViewList);
	frame.add(panel);
	add.addActionListener(this);
	SearchID.addActionListener(this);
	SearchName.addActionListener(this);
	ViewList.addActionListener(this);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == add) {
		jop1 = JOptionPane.showInputDialog("Enter ID");
		joppp1 = Integer.parseInt(jop1);
		jopp1 = JOptionPane.showInputDialog("Enter Name");
		studentList.put(joppp1, jopp1);
	}
	if (e.getSource() == SearchID) {
		jop2 = JOptionPane.showInputDialog("Search ID");
		joppp2 = Integer.parseInt(jop2);
	JOptionPane.showMessageDialog(null, studentList.get(joppp2));
	
	}
	if (e.getSource() == SearchName) {
		jop3 = JOptionPane.showInputDialog("Search Name");
		for (Integer i: studentList.keySet()) {
			if (studentList.get(i).equals(jop3)) {
				JOptionPane.showMessageDialog(null, (i));
			}
		}
		
	}
	if (e.getSource() == ViewList) {
		
		for (Integer n: studentList.keySet()) {
			JOptionPane.showMessageDialog(null, "Id: " + n + " Name: " + studentList.get(n));
		}
	}
}
}
