import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class DrawFlowerFrame extends JFrame {
    
    class DrawFlowerPanel extends JPanel{	
        public void paint(Graphics g){
        	Graphics2D g2 = (Graphics2D)g; 
        	//平移坐标轴
        	//g2.translate(DrawFlowerPanel.WIDTH/2, DrawFlowerPanel.HEIGHT/2);
        	g2.translate(200, 150);
        	
        	//绘制绿色花瓣
        	Ellipse2D.Float ellipse = new Ellipse2D.Float(30, 0, 70, 20);
        	Color color = new Color(0, 255, 0);
        	g2.setColor(color);
        	g2.fill(ellipse);
        	int i = 0;
        	while (i<8){
        	    g2.rotate(30);
        	    g2.fill(ellipse);
        	    i++;
        	}
        	//绘制红色花瓣
        	ellipse = new Ellipse2D.Float(20, 0, 60, 15);		//创建椭圆对象
        	color = new Color(255,0,0);				//创建颜色对象
        	g2.setColor(color);
        	g2.fill(ellipse);					//绘制椭圆
        	i = 0;
        	while(i<15){
        	    g2.rotate(75);;					//旋转画布
        	    g2.fill(ellipse);					//绘制椭圆
        	    i++;
        	}
        	//绘制黄色花瓣
        	ellipse = new Ellipse2D.Float(10, 0, 50, 15);
        	color = new Color(255,255,0);
        	g2.setColor(color);
        	g2.fill(ellipse);
        	i = 0;
        	while(i<8){
        	    g2.rotate(30);;
        	    g2.fill(ellipse);
        	    i++;
        	}
        	//绘制红色中心点
        	color = new Color(255, 0, 0);
        	g2.setColor(color);
        	ellipse = new Ellipse2D.Float(-10, -10, 20, 20);
        	g2.fill(ellipse);
        }
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    DrawFlowerFrame frame = new DrawFlowerFrame();
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
    public DrawFlowerFrame() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	
	DrawFlowerPanel panel2 = new DrawFlowerPanel();
//	contentPane.add(panel2, BorderLayout.CENTER);
	panel2.setBorder(new EmptyBorder(5, 5, 5, 5));
	panel2.setLayout(new BorderLayout(0, 0));	
	setContentPane(panel2);
	
    }

}
