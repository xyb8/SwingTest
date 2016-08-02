import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.Component;


public class PriorityTest extends JFrame {

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    PriorityTest frame = new PriorityTest();
		    frame.setVisible(true);
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public PriorityTest() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	Box topicBox = Box.createVerticalBox();// .createHorizontalBox();// new BoxLayout(getContentPane(),
	//getContentPane().setLayout( BoxLayout.Y_AXIS));
	getContentPane().add(topicBox,BorderLayout.NORTH);
	
	JProgressBar progressBar = new JProgressBar();	
	progressBar.setAlignmentY(2.0f);
	progressBar.setStringPainted(true);
	topicBox.add(progressBar);
	JProgressBar progressBar1 = new JProgressBar();
	progressBar1.setStringPainted(true);
	topicBox.add(progressBar1);
	JProgressBar progressBar2 = new JProgressBar();
	progressBar2.setStringPainted(true);
	topicBox.add(progressBar2);
	JProgressBar progressBar3 = new JProgressBar();
	progressBar3.setStringPainted(true);
	topicBox.add(progressBar3);
	JProgressBar progressBar4 = new JProgressBar();
	progressBar4.setStringPainted(true);
	topicBox.add(progressBar4);
	
	Thread threadA = new Thread(new MyThread(progressBar));
	Thread threadB = new Thread(new MyThread(progressBar1));
	Thread threadC = new Thread(new MyThread(progressBar2));
	Thread threadD = new Thread(new MyThread(progressBar3));
	Thread threadE = new Thread(new MyThread(progressBar4));
	
	setPriority("threadA",5,threadA);
	setPriority("threadB",5,threadB);
	setPriority("threadC",4,threadC);
	setPriority("threadD",3,threadD);
	setPriority("threadE",2,threadE);
    }
    
    public static void setPriority(String threadName,int priority,Thread t){
	t.setPriority(priority);
	t.setName(threadName);
	t.start();
    }
    
    private final class MyThread implements Runnable{
	private final JProgressBar bar;
	int count = 0;
	private MyThread(JProgressBar bar){
	    this.bar = bar;
	}
	
	public void run(){
	    while(true){
		bar.setValue(count+=4);
		try{
		    Thread.sleep(1000);
		}catch(InterruptedException e){
		    System.out.println("当期线程被中断");
		}
	    }
	}
    }

}
