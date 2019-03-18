package cn.zhou.listener;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * 鼠标监听器适配器--实现MouseListener接口
 * 接口方法太多，有的不会用到，每次实现接口，代码冗余，提前写一个类实现接口
 * 使用时，直线使用实现类，省略代码量
 * 
 */
public class MouseListenerAdapter implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
