package cn.zhou.frame;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

import org.eclipse.jgit.api.Git;

import cn.zhou.git.repository.GitRepository;
import cn.zhou.panel.FirstPanel;

/*
 * 本类是本项目的启动类
 */

public class LauncherFrame {

	public LauncherFrame() { // 无参构造器
		super();
		JFrame jf = new JFrame();
		// 设置窗口名称
		jf.setTitle("Git Bash");
		jf.setSize(800, 700); // 设置窗体大小
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的同时结束程序运行
		jf.setLocationRelativeTo(null); // 设置相对于系统界面的窗体的初始位置

		// jf.setVisible(true); // 设置窗体可见

		// 添加firstPanel
		jf.add(new FirstPanel());

		// runShell();

		git();

	}

	public void runShell() {
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.directory(new File("/home/zhou/workspace/git_gui"));
		try {
			Process process = processBuilder.command(
					"/usr/bin/gnome-terminal;git version").start();

			// Process process = processBuilder.command("git init").start();

			// List<String> list = new ArrayList<String>();
			// list.add("/usr/bin/gnome-terminal");
			// list.add("git status");
			// list.add("git log");
			//
			// processBuilder.command(list).start();
			process.getInputStream().read("git status".getBytes());
			process.getOutputStream().write("git status".getBytes());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) { // 主方法，用于启动项目
		new LauncherFrame();

		// try {
		//
		// Process process =
		// Runtime.getRuntime().exec("/usr/bin/gnome-terminal");
		// process.getInputStream().read("cd /home/zhou".getBytes()); // 读
		//
		// OutputStream os = process.getOutputStream(); // 写入流
		// os.write("git status".getBytes()); // 写
		// os.flush();
		// // os.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	public void git() {
		Git git = new Git(new GitRepository());
	}

}
