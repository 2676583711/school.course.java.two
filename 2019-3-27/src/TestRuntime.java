import java.io.IOException;

public class TestRuntime {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		//
		System.out.println();

		try {
			Process p = rt.exec("notepad.exe");

			Thread.sleep(3000); //休眠3秒
			p.destroy();  //銷毀進程，關閉打開的記事本

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
