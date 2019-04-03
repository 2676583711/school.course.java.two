import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class TestFileInputStream {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(new File(
					"a.txt"));
			int b = 0;
			while ((b = fileInputStream.read()) != -1) {
				System.out.print((char) b);
			}

			byte[] s = new byte[1024];
			fileInputStream.read(s);

			System.out.println("FileInputStream.read:" + s.toString() + "\n"
					+ (char) b);

			// /*************************/////////////*//**/*/*/*/*/**

			FileOutputStream fileOutputStream = new FileOutputStream(new File(
					"to.txt"), true);

			fileOutputStream.write("test FileOutputStream".getBytes());
			fileOutputStream.write("\n".getBytes());
			fileOutputStream.flush();
			fileOutputStream.close();

			// /***********************************

			byte[] p = new byte[1024 * 10];

			FileInputStream f2 = new FileInputStream(new File("a.jpg"));
			FileOutputStream f3 = new FileOutputStream(("pic/j.jpg"));

			while (f2.read() != -1) {
				f2.read(p);

				f3.write(f2.read());

				f3.write(p, 0, p.length);
				f3.flush();

			}

			f2.read(p);
			f3.write(p, 0, p.length);
			f3.flush();
			// f2.close();
			// f3.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
