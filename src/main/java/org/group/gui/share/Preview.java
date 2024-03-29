package org.group.gui.share;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.group.gui.vocabform.AbstractForm;
import org.group.model.Vocabulary;
import org.group.utils.audio.PlayMp3;
import org.group.utils.audio.TTSUtil;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;

public class Preview extends AbstractForm {

	protected JLabel lblImgIcon;
	protected JLabel lblImage;
	protected JLabel lblVoice;
	protected JButton button;
	protected Vocabulary vocab;

	public Preview() {
		GridBagLayout gridBagLayout = (GridBagLayout) getLayout();
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 94, 94, 44, 179 };

		lblVoice = new JLabel("Phát âm");
		GridBagConstraints gbc_lblVoice = new GridBagConstraints();
		gbc_lblVoice.anchor = GridBagConstraints.WEST;
		gbc_lblVoice.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoice.gridx = 0;
		gbc_lblVoice.gridy = 6;
		add(lblVoice, gbc_lblVoice);

		button = new JButton("");
		button.setToolTipText("Nếu không có file .mp3 sẽ mặc định dùng TTS");
		button.setBorder(new EmptyBorder(5, 5, 5, 5));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (vocab.getVoicePath() == null) {
					TTSUtil.speech(vocab.getEnglish());
				} else {
					PlayMp3.playMp3(vocab.getVoicePath());
				}
			}
		});
		Icon voiceIcon = new ImageIcon("G:\\Resource\\icon\\icons8_voice_40px.png");
		button.setIcon(voiceIcon);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.WEST;
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 1;
		gbc_button.gridy = 6;
		add(button, gbc_button);

		lblImage = new JLabel("Hình ảnh");
		GridBagConstraints gbc_lblImage = new GridBagConstraints();
		gbc_lblImage.anchor = GridBagConstraints.WEST;
		gbc_lblImage.insets = new Insets(0, 0, 0, 5);
		gbc_lblImage.gridx = 0;
		gbc_lblImage.gridy = 7;
		add(lblImage, gbc_lblImage);

		lblImgIcon = new JLabel("");
		Icon imgIcon = new ImageIcon("G:\\Server\\img\\icons8_facebook_old_300px.png");
		lblImgIcon.setIcon(new ImageIcon("G:\\Resource\\icon\\icons8_nothing_found_200px.png"));
		GridBagConstraints gbc_lblImgIcon = new GridBagConstraints();
		gbc_lblImgIcon.gridx = 1;
		gbc_lblImgIcon.gridy = 7;
		add(lblImgIcon, gbc_lblImgIcon);

	}

	public void setData(Vocabulary v) {
		vocab = v;
		setUnedittable();
		super.setData(v);
		if (v.getImgPath() != null) {
			Icon imgIcon = new ImageIcon(v.getImgPath());
			lblImgIcon.setIcon(imgIcon);
		}

		if (v.getVoicePath() != null) {

		}

	}

	private void setUnedittable() {
		this.englishTF.setEditable(false);
		this.hashtagTF.setEditable(false);
		this.goiNhoTA.setEditable(false);
		this.phienAmTF.setEditable(false);
		this.vietNamTA.setEditable(false);
	}
}
