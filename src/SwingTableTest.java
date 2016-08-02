import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;


public class SwingTableTest extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    SwingTableTest frame = new SwingTableTest();
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
    public SwingTableTest() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	init();
    }

    public void init(){
	    Container contentPane = getContentPane();
	    contentPane.setLayout(new BorderLayout());
	    final String[] colHeads = {"Name", "Phone", "Fax"};
	    final Object[][] data={
	        {"cai", "1122","1122" },
	        {"jie", "2222","2222" },
	        {"tt", "3322","3322" }
	    };
	    JTable table = new JTable(data, colHeads);
	    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	    JScrollPane jsp = new JScrollPane(table, v, h);
	    contentPane.add(jsp, BorderLayout.CENTER);
	  }
}
