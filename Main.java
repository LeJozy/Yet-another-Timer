import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Main {
	
	JFrame window;
	JLabel counterLabel;
	Font font1 = new Font("Times New Roman", Font.PLAIN, 70);
	Timer timer;
	boolean timerStatus;
	
	int second, minute;
	String ddsecond, ddminute;
	
	DecimalFormat dFormat = new DecimalFormat("00");

	public static void main(String[] args) {
		
		new Main();	

	}
	
	public Main () {
		
		// Creating the window
		window = new JFrame();
		window.setSize(800, 600);
		// There we can know, how to close this
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creating text and configure its fashion
		counterLabel = new JLabel("this is sample");
		counterLabel.setBounds(300, 230, 200, 100);
		counterLabel.setHorizontalAlignment(JLabel.CENTER);
		counterLabel.setFont(font1);
		
		// Putting that in 
		window.add(counterLabel);	
		
		//here we make the window visible
		window.setVisible(true);
		
		
//		//Normal Timer standard
//		counterLabel.setText("00:00");
//		second = 0;
//		minute = 0;
//		normalTimer();
//		timer.start();
		
		//here must be a button for creating new activity (through constructor, where we can type a name)
		
		//here must be the button for music? (for this we should use API of youtube)
		
		//here must be the button with a windows, where we can see a list (PosgreSQL) of activities
		
		//Initializing of the timer
		normalTimer();
		
		//here must be a button of starting
		JButton startButton = new JButton("Start");
		startButton.setBounds(100, 100, 100, 100);
		window.add(startButton);
		
		//here must be a button of stopping
		
		JButton stopButton = new JButton("Stop");
		stopButton.setBounds(100, 100, 100, 100);
		window.add(stopButton);
		stopButton.setVisible(false);
		
		//Functionality of buttons

		
		startButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent k) {
				counterLabel.setText("00:00");
				second = 0;
				minute = 0;

				timer.start();
				timerStatus = true;
				startButton.setVisible(false);
				stopButton.setVisible(true);
				
				
			}
			
		});
		
////		Hidding a button
//		if (timerStatus == true) {
//			startButton.hide();
//			
//		}
		
		
		stopButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent k) {
				counterLabel.setText("00:00");
				second = 0;
				minute = 0;

				timer.stop();
				timerStatus = true;
				stopButton.setVisible(false);
				startButton.setVisible(true);
				
				
			}
			
		});
		
		//May be we make a little animation?
	
	}
	
	public void normalTimer () {
	timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			second++;
			ddsecond = dFormat.format(second);
			ddminute = dFormat.format(minute);
			
			counterLabel.setText(ddminute + ":"+ ddsecond);
			
			if (second == 60) {
				second=0;
				minute++;
				
				ddsecond = dFormat.format(second);
				ddminute = dFormat.format(minute);
				counterLabel.setText(ddminute + ":" + ddsecond);
			}
		}
	});
	
}

}
