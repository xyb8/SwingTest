import javax.swing.JOptionPane;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

public class SWTTest {

    /**
     * Launch the application.
     * 
     * @param args
     */
    public static void main(String[] args) {
	Display display = Display.getDefault();
	Shell shell = new Shell();
	shell.setBackground(SWTResourceManager
		.getColor(SWT.COLOR_TITLE_BACKGROUND));
	shell.setSize(450, 300);
	shell.setText("SWT Application");

	Button bt1 = new Button(shell, SWT.NULL); // 创建默认按钮
	bt1.setText("SWT.NULL"); // 设置按钮上的文字
	bt1.setBounds(10, 10, 75, 30); // 设置按钮显示位置及宽度、高度
	Button bt2 = new Button(shell, SWT.PUSH | SWT.BORDER); // 创建深陷型按钮
	bt2.setText("SWT.PUSH");
	bt2.setBounds(90, 10, 75, 30);
	Button check1 = new Button(shell, SWT.CHECK);// 创建复选按钮
	check1.setText("SWT.CHECK");
	check1.setBounds(10, 50, 75, 30);
	Button check2 = new Button(shell, SWT.CHECK | SWT.BORDER);// 创建深陷型复选按钮
	check2.setText("SWT.CHECK");
	check2.setBounds(90, 50, 75, 30);
	Button radio1 = new Button(shell, SWT.RADIO);// 创建单选按钮j
	radio1.setText("SWT.RADIO");
	radio1.setBounds(10, 90, 75, 30);
	Button radio2 = new Button(shell, SWT.RADIO | SWT.BORDER);// 创建深陷型单选按钮
	radio2.setText("SWT.RADIO");
	radio2.setBounds(90, 90, 75, 30);
	Button arrowLeft = new Button(shell, SWT.ARROW | SWT.LEFT);// 创建箭头按钮（向左）
	arrowLeft.setBounds(10, 130, 75, 20);
	Button arrowRight = new Button(shell, SWT.ARROW | SWT.RIGHT
		| SWT.BORDER);
	arrowRight.setBounds(90, 130, 75, 20);
	shell.pack();

	shell.open();
	shell.layout();

	while (!shell.isDisposed()) {
	    if (!display.readAndDispatch()) {
		display.sleep();
	    }
	}
	display.dispose();
    }

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {
	int s = evt.getButton();
	JOptionPane.showMessageDialog(null, s);
    }
}
