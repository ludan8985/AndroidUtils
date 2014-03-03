package cn.redonly.trainman4ios.testutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class U_FileUtil {

	/**
	 * 复制文件
	 * 
	 * @param oldPath
	 * @param newPath
	 */
	public static void copyFile(String oldPath, String newPath) {
		try {
			File newFile = new File(newPath);
			if (newFile.exists() && newFile.isFile()) {
				return;
			}
			if (newFile.getParentFile() == null
					|| !newFile.getParentFile().isDirectory()) {
				newFile.getParentFile().mkdirs();
			}
			File oldfile = new File(oldPath);
			if (oldfile.exists()) {
				InputStream inStream = new FileInputStream(oldPath); // 读入原文件
				FileOutputStream outStream = new FileOutputStream(newPath);
				byte[] buffer = new byte[1024 * 8];

				int byteread = 0;
				while ((byteread = inStream.read(buffer)) != -1) {
					outStream.write(buffer, 0, byteread);
				}
				outStream.close();
				inStream.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
