/**
 * 
 */

/**
 * @author dhillon
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Fateh.LinkedList.LinkedListTest;


public class MainWindow extends JFrame implements ActionListener {
	
	protected LinkedListTest ll;
	
	JPanel panel = new JPanel();
	JButton button = new JButton("Add Node");
	JLabel answer = new JLabel();
	
	MainWindow()
	{
		super("My First Frame");
		setBounds(100,100,300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cnt = this.getContentPane();
		cnt.add(panel);
		panel.add(button);
		button.requestFocus();
		button.addActionListener(this);
		panel.add(answer);
		setVisible(true);
		ll = new LinkedListTest();
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainWindow();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object source = arg0.getSource();
		if(source == button)
		{	  	
		      button.setText("Hello");
		      answer.setText(ll.isEmptyList());
		      setVisible(true); 
		}
	}

}
