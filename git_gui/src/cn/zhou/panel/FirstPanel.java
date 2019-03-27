package cn.zhou.panel;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import cn.zhou.button.FirstButton;
import cn.zhou.listener.MouseListenerAdapter;

public class FirstPanel extends JPanel {

	public FirstPanel() {
		super();

		setSize(800, 800); // 设置窗口大小
		setForeground(java.awt.Color.orange); // 设置前景色
		setBackground(java.awt.Color.LIGHT_GRAY); // 设置背景色
		// 设置布局
		setLayout(new FlowLayout());
		// 添加按钮
		FirstButton fb = new FirstButton("execute");

		add(new FirstButton("execute")).addMouseListener(new MouseListenerAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				System.out.println("21331564456456");
			}
		});

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

}
