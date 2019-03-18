package cn.zhou.button;

import java.awt.Dimension;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class FirstButton extends JButton {//

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FirstButton() {
		super();
		setName("start");
		setSize(200, 50);

		setLocation(300, 300);

		// setLayout(new FlowLayout());
		// addMouseListener(new Mouse());
	}

	public FirstButton(String text) {
		super();
		setName(text); // 设置按钮的属性名称(与显示名称不一样)
		setSize(200, 50);
		// 对JButton大小的设置
		// 因为JButen是属于小器件类型的，所以一般的setSize不能对其惊醒大小的设置，所以一般我们用
		setPreferredSize(new Dimension(300, 30));
		// setLocation(300, 300);
		setText(text); // 设置按钮在窗口中显示的文字(显示名称)

	}

	@Override
	public synchronized void addMouseListener(MouseListener l) {
		// TODO Auto-generated method stub
		super.addMouseListener(l);
	}

}
