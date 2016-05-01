package HelloWorldController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import HelloWorldModel.HelloWorldModel;
import HelloWorldView.HelloWorldView;

public class HelloWorldController {
	
	private HelloWorldModel model;
	private HelloWorldView view;
	
	public HelloWorldController(HelloWorldModel model, HelloWorldView view) {
		this.model = model;
		this.view  = view;
		
		this.view.addActionListener(new PressActionListener());
	}
	
	class PressActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String message = "";
			try{
				message = view.getInput();
				
				model.setMessage(message);
				
				view.setResult();
			}
			catch(Exception ex){
				System.out.println("Not a sentence!");
			}
		}
		
	}
}
