package com.threads;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.awt.event.WindowAdapter;

public class BallGameRentrant extends Frame implements Runnable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		Thread t1, t2, t3;
		int y1 = 400, y2 = 400, y3 = 400;
		
		public BallGameRentrant()	 
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
			boolean b=false;
			Thread curr = Thread.currentThread();
			if(curr.getName().equals("RED"))
			{
					for(;;)
					{
						if(b==false)
						{	
							y1--;
							if(y1<=20){
								b=true;
								try {
									reach();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						if(b==true){
							y1++;
							if(y1>=400){
								b=false;
								try {
									reach();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						}
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {}
				}
			}
			else if(curr.getName().equals("GREEN"))
			{
					for(;;)
					{
						if(b==false)
						{	
							y2--;
							if(y2<=20){
								b=true;
								try {
									reach();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
						if(b==true){
							y2++;
							if(y2>=400){
								b=false;
								try {
									reach();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						}
					repaint();
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {}
				}
			}
			else if(curr.getName().equals("BLUE"))
			{	for(;;)
				{
					if(b==false)
					{	
						y3--;
						if(y3<=20){
							b=true;
							try {
								reach();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					if(b==true){
						y3++;
						if(y3>=400){
							b=false;
							try {
								reach();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				repaint();
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {}
			}
		}
}
		ReentrantLock rl=new ReentrantLock();
        final Condition notFull  = rl.newCondition(); 

		public void reach() throws InterruptedException{
			Thread t= Thread.currentThread();
			rl.lock();
			try{
				if(t.getName().equals("RED")){
					notFull.await();
				}
				if(t.getName().equals("GREEN")){
					notFull.await();
				}
				if(t.getName().equals("BLUE")){
					notFull.signalAll();
				}
				System.out.println("locked");
			}
		finally{
			System.out.println("unlocked");
				rl.unlock();
				System.out.println("unlocked");
		}		
				
		}		
	public static void main(String[] args) {
		Frame mf = new BallGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

}