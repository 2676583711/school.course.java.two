package cn.zhou.work5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class example5 {

	public static void main(String[] args) {

		File file = new File("/home/zhou/test.txt");

		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream("test.txt");

			byte[] b = new byte[1024];

			while (fis.read(b) != -1) {
				fos.write(b);
				fos.flush();
			}
			fis.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
