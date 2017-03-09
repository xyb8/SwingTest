import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Component;

import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class TabTest extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    TabTest frame = new TabTest();
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
    public TabTest() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JTabbedPane tabbedPane = new JTabbedPane();
	
	//tabbedPane.setCloseButtonEnabled(true);
	        tabbedPane.addTab("测试一", null, new JLabel("测试一"));
	        tabbedPane.addTab("测试二", null, new JLabel("测试二"));
	        tabbedPane.addTab("测试三", null, new JLabel("测试三"));
	        tabbedPane.addTab("测试四", null, new JLabel("测试四"));
	        JPanel jpanelFirst = new JPanel(); 
	        
	        JButton jb = new JButton();
	        jb.setText("测试");
	        jb.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.print("点击了按钮呢");
			JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.INFORMATION_MESSAGE);
//			JOptionPane.showInternalMessageDialog(null, "information",
//				"information", JOptionPane.INFORMATION_MESSAGE);
		    }
	            
	        });
	        jpanelFirst.add(jb);
	        
	        tabbedPane.addTab("测试五", null, jpanelFirst, "first");// 加入第一个页面  
	        tabbedPane.setMnemonicAt(0, KeyEvent.VK_0);// 设置第一个位置的快捷键为0  
	        
//	        tabbedPane.addTabbedPaneListener(new TabbedPaneListener(){
//	            @Override
//	            public void allTabsRemoved() {
//	                // TODO Auto-generated method stub
//	                
//	            }
//	            @Override
//	            public boolean canTabClose(Tab tab, Component component) {
//	                // TODO Auto-generated method stub
//	                return false;
//	            }
//	            @Override
//	            public void tabAdded(Tab tab, Component component, int index) {
//	                // TODO Auto-generated method stub
//	                
//	            }
//	            @Override
//	            public void tabRemoved(Tab tab, Component component, int index) {
//	                // TODO Auto-generated method stub
//	                System.out.println("close");
//	            }
//	            @Override
//	            public void tabSelected(Tab tab, Component component, int index) {
//	                // TODO Auto-generated method stub
//	                
//	            }
//	        });
	contentPane.add(tabbedPane, BorderLayout.NORTH);
    }

}
