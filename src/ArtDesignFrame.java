import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class ArtDesignFrame extends JFrame {
    
    class ArtDesignPanel extends JPanel{
	public void paint(Graphics g){
	    Graphics2D g2 = (Graphics2D)g;
	    Ellipse2D.Float ellipse = new Ellipse2D.Float(-80, 5, 160, 10);
	    Random random = new Random();
	    g2.translate(160, 90);
	    int R = random.nextInt(256);
	    int G = random.nextInt(256);
	    int B = random.nextInt(256);
	    Color color = new Color(R,G,B);
	    g2.setColor(color);
	    g2.draw(ellipse);
	    int i = 0;
	    while (i<100){
		  R = random.nextInt(256);
		     G = random.nextInt(256);
		     B = random.nextInt(256);
		     color = new Color(R,G,B);
		    g2.setColor(color);
		    g2.rotate(10);
		    g2.draw(ellipse);
		    i ++;
	    }
	}
    }

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    ArtDesignFrame frame = new ArtDesignFrame();
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
    public ArtDesignFrame() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	ArtDesignPanel penel2 = new ArtDesignPanel();
	contentPane.add(penel2);
    }

}
