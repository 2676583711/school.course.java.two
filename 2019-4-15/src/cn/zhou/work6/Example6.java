package cn.zhou.work6;

public class Example6 extends Thread {

	public Example6(String name) {
		this.setName(name);
	}

	public static void main(String[] args) {
		// 创建第一个线程
		new Example6("thread-1").start();

		// 创建第二个线程
		new Example6("Tread-2").start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 26; i++) {
			System.out.println(this.getName() + ":" + (char) (96 + i));
		}
	}
}
