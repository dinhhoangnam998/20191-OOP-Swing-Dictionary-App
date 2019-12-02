package org.group.utils.gui;

import java.io.File;

import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooserUtil {
	private static JFileChooser fileChooser = new JFileChooser("G:\\Client");

	public static File chooseFile(JComponent parent, String fileExtension) {
		FileFilter filter = new FileNameExtensionFilter(null, fileExtension);
		fileChooser.setFileFilter(filter);
		int result = fileChooser.showOpenDialog(parent);
		if (result == fileChooser.APPROVE_OPTION) {
			return fileChooser.getSelectedFile();
		} else {
			return null;
		}
	}
}
