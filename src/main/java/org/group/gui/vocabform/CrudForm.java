package org.group.gui.vocabform;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.group.model.Vocabulary;
import org.group.utils.gui.FileChooserUtil;

public class CrudForm extends AbstractForm {
	protected JButton imgURLBtn;
	protected JButton voiceURLBtn;
	protected File imgFile;
	protected File voiceFile;

	public CrudForm() {
		GridBagLayout gridBagLayout = (GridBagLayout) getLayout();
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 94, 94, 52 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };

		JLabel lblFile = new JLabel("Chọn file");
		GridBagConstraints gbc_lblFile = new GridBagConstraints();
		gbc_lblFile.anchor = GridBagConstraints.WEST;
		gbc_lblFile.insets = new Insets(0, 0, 0, 5);
		gbc_lblFile.gridx = 0;
		gbc_lblFile.gridy = 6;
		add(lblFile, gbc_lblFile);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 6;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 194, 63, 0 };
		gbl_panel.rowHeights = new int[] { 25, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		imgURLBtn = new JButton("File hình ảnh");
		imgURLBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imgFile = FileChooserUtil.chooseFile(CrudForm.this, "png");
			}
		});
		GridBagConstraints gbc_imgURLBtn = new GridBagConstraints();
		gbc_imgURLBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_imgURLBtn.insets = new Insets(0, 0, 0, 5);
		gbc_imgURLBtn.gridx = 0;
		gbc_imgURLBtn.gridy = 0;
		panel.add(imgURLBtn, gbc_imgURLBtn);

		voiceURLBtn = new JButton("File âm thanh");
		voiceURLBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voiceFile = FileChooserUtil.chooseFile(CrudForm.this, "mp3");
			}
		});
		GridBagConstraints gbc_voiceURLBtn = new GridBagConstraints();
		gbc_voiceURLBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_voiceURLBtn.gridx = 1;
		gbc_voiceURLBtn.gridy = 0;
		panel.add(voiceURLBtn, gbc_voiceURLBtn);

	}

	@Override
	protected Vocabulary collectInfo() {
		Vocabulary v = super.collectInfo();
		if (imgFile != null) {
			v.setImgPath(imgFile.getPath());
		}

		if (voiceFile != null) {
			v.setVoicePath(voiceFile.getPath());
		}
		return v;
	}

}
