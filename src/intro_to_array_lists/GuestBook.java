package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JButton buttonOne = new JButton("Add Name");
	JButton buttonTwo = new JButton("View Names");
	ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		
	}
	void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		frame.setSize(500, 80);
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		buttonOne.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(buttonOne==pressed) {
			String name = JOptionPane.showInputDialog("Enter a name");
			list.add(name);
		}
		else if(buttonTwo==pressed) {
			for (int i = 0; i < list.length; i++) {
				
			}
		}
	}
}
