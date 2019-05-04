package cn.zhou;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Move {

	public static void main(String[] args) throws IOException {
		//目标
		String path = " ";
		// 目的的
		String destination = " "; 
		
		//具体的移动操作
		read(path, destination);

	}

//	private static String tf = null;

	public static void read(String path, String destination) {
		// 根据文件路径创建文件对象
		File file = getFile(path);
		// 根据文件路径遍历文件,返回文件名数组
		String[] f1 = file.list();
		// 遍历文件名数组
		for (String f2 : f1) {
			Path p = Paths.get(path, f2);
			// System.out.println("p=" + p);

			// System.out.println(p);
			if (getFile(p.toString()).isDirectory()) {
				read(p.toString(), destination);
			} else {
				// tf = Paths.get(path, f2).toString();
				// String name = getFile(p.toString()).getName();

				if (f2.contains(".avi")) {

					// System.out.println(tf + name);
					File f = getFile(destination);
					if (!f.exists()) {
						f.mkdir();
					}

					try {
						System.out.println("f2=" + f2);

						InputStream fr = new FileInputStream(Paths.get(path, f2).toString());
						BufferedReader br = new BufferedReader(new FileReader(Paths.get(path, f2).toString()));

						System.out.println("p=" + Paths.get(path, f2));

						int len = (int) new File(Paths.get(path, f2).toString()).length();
						// byte[] b = new byte[1024 * 1024 * 100];
						// String[] bc = new String[len];
						byte[] b = new byte[len];
						int i = fr.read(b);

						System.out.println("i=" + i);

						// String l = null;
						// BufferedWriter bw = new BufferedWriter(new FileWriter(Paths.get(destination,
						// f2).toString()));
						// bw.flush();
						// bw.close();

						OutputStream os = new FileOutputStream(Paths.get(destination, f2).toString());

						os.write(b);

						// bw.write(br.readLine());
//bw.write(s, off, len);
						// br.close();

						os.flush();
						os.close();

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}

	}

	public static boolean isDirectory(File file) {
		// 判断是否是目录
		boolean b = file.isDirectory();
		// 返回判断结果，true,false
		return b;
	}

	public static File getFile(String path) {
		File f = new File(path);
		return f;
	}

}

