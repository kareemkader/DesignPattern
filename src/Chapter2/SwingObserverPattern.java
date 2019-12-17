package Chapter2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingObserverPattern {
	JFrame frame;
	public static void main(String[] args) {
		SwingObserverPattern ob=new SwingObserverPattern();
		ob.go();
		
	}
	public  void go() {

		frame =new JFrame("test our pattern");
		JButton button=new JButton("press Here");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("i'm an angel don't do it !!");
				
			}
		});
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("i'm a daemon do it !!");
			}
		});
		
		frame.setVisible(true);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
	}

}
