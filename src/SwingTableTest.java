import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;


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
	    final String[] colHeads = {"Name", "Phone", "Fax","Button"};
	    final Object[][] data={
	        {"cai", "1122","1122",null },
	        {"jie", "2222","2222",null },
	        {"tt", "3322","3322",null }
	    };
	    JTable table = new JTable(data, colHeads);
	    
	    table.setCellEditor(new TableCellEditor() {
		    private JButton editor = new JButton();
		    private JTextField dephaut = new JTextField();
		     
		    {//相当于构造函数。
		        editor.addActionListener(new ActionListener() {
		            @Override
			    public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.print("点击了按钮呢");
				JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.INFORMATION_MESSAGE);
//				JOptionPane.showInternalMessageDialog(null, "information",
//					"information", JOptionPane.INFORMATION_MESSAGE);
			    }
		        });
//		        {
//		            /* 业务方法 */
//		            System.out.print("点击了按钮呢");
//		        };
		    }    
		 
		    /* 此处省略 N 多待实现方法*/
		    public Component getTableCellEditorComponent(
		            JTable table,
		            Object value,
		            boolean isSelected,
		            int row,
		            int column) {
		     
		    if (column == 3) {
		            return this.editor;           
		        } else {
		            return this.dephaut;
		        }            
		    }

		    @Override
		    public Object getCellEditorValue() {
			// TODO Auto-generated method stub
			return null;
		    }

		    @Override
		    public boolean isCellEditable(EventObject anEvent) {
			// TODO Auto-generated method stub
			return false;
		    }

		    @Override
		    public boolean shouldSelectCell(EventObject anEvent) {
			// TODO Auto-generated method stub
			return false;
		    }

		    @Override
		    public boolean stopCellEditing() {
			// TODO Auto-generated method stub
			return false;
		    }

		    @Override
		    public void cancelCellEditing() {
			// TODO Auto-generated method stub
			
		    }

		    @Override
		    public void addCellEditorListener(CellEditorListener l) {
			// TODO Auto-generated method stub
			
		    }

		    @Override
		    public void removeCellEditorListener(CellEditorListener l) {
			// TODO Auto-generated method stub
			
		    }
	    });
		    
	    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	    JScrollPane jsp = new JScrollPane(table, v, h);
	    contentPane.add(jsp, BorderLayout.CENTER);
	  }
}
