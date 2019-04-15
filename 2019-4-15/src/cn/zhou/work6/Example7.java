package cn.zhou.work6;

public class Example7 {

	public static void main(String[] args) {

		new Thread("Thread-1") {
			@Override
			public void run() {
				super.run();

				char c2 = 'a';
				for (int i = 0; i < 26; i++) {
					System.out.println(this.getName() + ":" + c2);
					c2++;
				}

			}
		}.start();

		new Thread("Thread-2") {
			@Override
			public void run() {
				super.run();

				char c2 = 'A';
				for (int i = 0; i < 26; i++) {
					System.out.println(this.getName() + ":" + c2);
					c2++;
				}

			}
		}.start();

	}

}
