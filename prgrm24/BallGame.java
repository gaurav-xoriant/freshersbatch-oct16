package thread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class BallGame extends Frame implements Runnable {

		Thread t1, t2, t3;
		int y1 = 400, y2 = 400, y3 = 400;
		
		public BallGame() 
		{
			super("Ball game");
			
			setBackground(Color.CYAN);
			setSize(500, 500);
			setVisible(true);
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			t1 = new Thread(this);
			t2 = new Thread(this);
			t3 = new Thread(this);
			t1.setName("RED");
			t2.setName("GREEN");
			t3.setName("BLUE");
			
			t1.start();
			t2.start();
			t3.start();
			
		}
		
		public void paint(Graphics g) 
		{
			
				g.setColor(Color.RED);
				g.fillOval(100, y1, 50, 50);
				
			
			
				g.setColor(Color.GREEN);
				g.fillOval(200, y2, 50, 50);
				
				
				g.setColor(Color.BLUE);
				g.fillOval(300, y3, 50, 50);
				
			
		}
		
		public void run()
		{
			Thread curr = Thread.currentThread();
			if(curr.getName().equals("RED"))
			{
				for(;;)
				{
					y1--;
					if(y1 < 10)
						y1=400;
					repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}
				}
			}
			else if(curr.getName().equals("GREEN"))
			{
				for(;;)
				{
					y2--;
					if(y2 < 10)
						y2=400;
					repaint();
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {}
				}
			}
			else if(curr.getName().equals("BLUE"))
			{
				for(;;)
				{
					y3--;
					if(y3 < 10)
						y3=400;
					repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {}
				}
			}
		}

	public static void main(String[] args) {
		Frame mf = new BallGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

}
