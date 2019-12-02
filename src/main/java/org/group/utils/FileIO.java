package org.group.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileIO {

	public static void copyFile(String srcPath, String destPath) {
		File scr = new File(srcPath);
		File dest = new File(destPath);
		try {
			Files.copy(scr.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("copy file failure");
			e.printStackTrace();
		}
	}
}
