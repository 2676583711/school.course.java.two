package cn.zhou.work7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 使用java－GUI实现一个简单的登录界面
 * 
 * @author zhou
 *
 */
public class Example extends JFrame {

	public Example() {
		// 调用父类的无参构造器
		super();
		// 设置窗口可见
		setVisible(true);
		// 设置窗口大小
		setSize(500, 400);
		// 设置窗口初始位置
		setLocation(400, 100);
		// 设置关闭窗口的同时关闭程序
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 设置背景色
		setBackground(Color.orange);
		// 设置窗口名称
		setTitle("java-gui-login");
	}

	public static void main(String[] args) {
		// 实例化实验程序对象，并且添加panel容器,同时启动程序
		new Example().add(new Panel());
	}

}

/**
 * Panel容器
 * 
 * @author zhou
 *
 */
class Panel extends JPanel {

	public Panel() {
		super();
		// 设置面板的背景色
		setBackground(Color.orange);
		//设置布局管理器
		setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

		//添加文本域
		 JTextArea textArea = new JTextArea(18,43);//x:高度,y:宽度
		// 设置 文本域的背景色
		 textArea.setBackground(Color.WHITE);
		 textArea.setSize(10, 30);
		 textArea.setText("hello,how are you???");
		 textArea.setText("hello,how are you???");
		 textArea.setText("hello,how are you???");
		 textArea.setMargin( new Insets(5, 5, 5, 5));
		  textArea.setEditable(true);
		  textArea.setSize(18, 43);
		  textArea.set
		 add(textArea);
		
		 //添加文本输入框1
		JTextField jTextField = new JTextField(20);
		jTextField.setLocation(50, 100);
		//添加标签
		add(new JLabel("聊天信息:"));
		add(jTextField);
		//添加按钮
		JButton jButton = new JButton("发送");
		add(jButton);
 
	}

}
