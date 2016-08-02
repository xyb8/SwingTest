import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.JButton;

import org.eclipse.ui.internal.dialogs.ShowViewDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Test frame = new Test();
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
    public Test() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);

	final JPanel panel = new JPanel();
	contentPane.add(panel, BorderLayout.CENTER);

	final JButton btnMybutton = new JButton("MyButton");
	final BasicArrowButton up = new BasicArrowButton(BasicArrowButton.NORTH);
	final BasicArrowButton down = new BasicArrowButton(
		BasicArrowButton.SOUTH);
	final BasicArrowButton right = new BasicArrowButton(BasicArrowButton.EAST);
	final BasicArrowButton left = new BasicArrowButton(
		BasicArrowButton.WEST);
	btnMybutton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel.setBorder(new TitledBorder("Directions"));
		panel.add(up);
		panel.add(down);
		panel.add(left);
		panel.add(right);
		btnMybutton.setIcon(new ImageIcon(""));
	    }
	});
	panel.add(btnMybutton);
    }

}
