import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(
					new FileInputStream("a.jpg"));

			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
					new FileOutputStream("pic/t.jpg"));

			// int len = 0;
			byte[] len = new byte[1024];

			long ct1 = System.currentTimeMillis();

			while (bufferedInputStream.read() != -1) {

				bufferedOutputStream.write(len);
				bufferedOutputStream.flush();
			}
			long ct2 = System.currentTimeMillis();

			System.out.println("cast time:" + (ct2 - ct1));

			bufferedInputStream.close();
			bufferedOutputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
