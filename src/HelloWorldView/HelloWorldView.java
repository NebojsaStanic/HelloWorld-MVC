package HelloWorldView;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Position;

public class HelloWorldView extends JFrame{

	private JTextField input = new JTextField(30);
	private JButton button = new JButton("Press for message");
	private JLabel result = new JLabel();
	
	
	public HelloWorldView() {
		
		JPanel myPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		myPanel.add(input);
		myPanel.add(button);
		myPanel.add(result);
		
		
		
		this.add(myPanel);
	}
	
	public String getInput(){
		return input.getText();
	}
	
	public void setResult(){
		result.setText(getInput());
	}
	
	public void addActionListener(ActionListener listener){
		button.addActionListener(listener);
	}
}
