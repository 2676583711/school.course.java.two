package cn.zhou.work5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author zhou
 *
 */
public class Example5 {

	public static void main(String[] args) {

		File file = new File("/home/zhou/test.txt");

		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream("test.txt");

			byte[] b = new byte[1024];

			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			while (bis.read(b) != -1) {
				// fos.write(b);
				bos.write(b);
				bos.flush();
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
