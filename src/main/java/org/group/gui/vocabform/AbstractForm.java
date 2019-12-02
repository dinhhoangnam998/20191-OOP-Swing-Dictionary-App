package org.group.gui.vocabform;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.group.model.Vocabulary;

public class AbstractForm extends JPanel {
	protected JTextField englishTF;
	protected JTextField hashtagTF;
	protected JTextField phienAmTF;
	protected JTextArea vietNamTA;
	protected JTextArea goiNhoTA;
	protected ButtonGroup tuLoaiGroup;
	protected JRadioButton rdbtnNoun;
	protected JRadioButton rdbtnVerb;
	protected JRadioButton rdbtnAdj;
	protected JRadioButton rdbtnAdv;
	protected JRadioButton rdbtnOther;

	public AbstractForm() {
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 104, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 94, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblEnglish = new JLabel("English word");
		GridBagConstraints gbc_lblEnglish = new GridBagConstraints();
		gbc_lblEnglish.anchor = GridBagConstraints.WEST;
		gbc_lblEnglish.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnglish.gridx = 0;
		gbc_lblEnglish.gridy = 0;
		add(lblEnglish, gbc_lblEnglish);

		englishTF = new JTextField();
		englishTF.setText("hello");
		GridBagConstraints gbc_englishTF = new GridBagConstraints();
		gbc_englishTF.insets = new Insets(0, 0, 5, 0);
		gbc_englishTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_englishTF.gridx = 1;
		gbc_englishTF.gridy = 0;
		add(englishTF, gbc_englishTF);
		englishTF.setColumns(10);

		JLabel lblHashtag = new JLabel("Hashtag");
		GridBagConstraints gbc_lblHashtag = new GridBagConstraints();
		gbc_lblHashtag.anchor = GridBagConstraints.WEST;
		gbc_lblHashtag.insets = new Insets(0, 0, 5, 5);
		gbc_lblHashtag.gridx = 0;
		gbc_lblHashtag.gridy = 1;
		add(lblHashtag, gbc_lblHashtag);

		hashtagTF = new JTextField();
		hashtagTF.setText("#test");
		GridBagConstraints gbc_hastagTF = new GridBagConstraints();
		gbc_hastagTF.insets = new Insets(0, 0, 5, 0);
		gbc_hastagTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_hastagTF.gridx = 1;
		gbc_hastagTF.gridy = 1;
		add(hashtagTF, gbc_hastagTF);
		hashtagTF.setColumns(10);

		JLabel lblTuLoai = new JLabel("Từ loại");
		GridBagConstraints gbc_lblTuLoai = new GridBagConstraints();
		gbc_lblTuLoai.anchor = GridBagConstraints.WEST;
		gbc_lblTuLoai.insets = new Insets(0, 0, 5, 5);
		gbc_lblTuLoai.gridx = 0;
		gbc_lblTuLoai.gridy = 2;
		add(lblTuLoai, gbc_lblTuLoai);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		tuLoaiGroup = new ButtonGroup();
		rdbtnNoun = new JRadioButton("noun");
		rdbtnNoun.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNoun.setActionCommand("noun");
		tuLoaiGroup.add(rdbtnNoun);
		panel.add(rdbtnNoun);

		rdbtnVerb = new JRadioButton("verb");
		rdbtnNoun.setActionCommand("verb");
		tuLoaiGroup.add(rdbtnVerb);
		panel.add(rdbtnVerb);

		rdbtnAdj = new JRadioButton("adj");
		rdbtnNoun.setActionCommand("adj");
		tuLoaiGroup.add(rdbtnAdj);
		panel.add(rdbtnAdj);

		rdbtnAdv = new JRadioButton("adv");
		rdbtnNoun.setActionCommand("adv");
		tuLoaiGroup.add(rdbtnAdv);
		panel.add(rdbtnAdv);

		rdbtnOther = new JRadioButton("other");
		rdbtnNoun.setActionCommand("other");
		tuLoaiGroup.add(rdbtnOther);
		rdbtnOther.setSelected(true);
		rdbtnOther.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(rdbtnOther);

		JLabel lblPhienAm = new JLabel("Phiên âm");
		GridBagConstraints gbc_lblPhienAm = new GridBagConstraints();
		gbc_lblPhienAm.anchor = GridBagConstraints.WEST;
		gbc_lblPhienAm.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhienAm.gridx = 0;
		gbc_lblPhienAm.gridy = 3;
		add(lblPhienAm, gbc_lblPhienAm);

		phienAmTF = new JTextField();
		phienAmTF.setText("/h\u0259\u02C8lo\u028A/");
		GridBagConstraints gbc_phienAmTF = new GridBagConstraints();
		gbc_phienAmTF.insets = new Insets(0, 0, 5, 0);
		gbc_phienAmTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_phienAmTF.gridx = 1;
		gbc_phienAmTF.gridy = 3;
		add(phienAmTF, gbc_phienAmTF);
		phienAmTF.setColumns(10);

		JLabel lblVietnamese = new JLabel("Nghĩa Tiếng Việt");
		GridBagConstraints gbc_lblVietnamese = new GridBagConstraints();
		gbc_lblVietnamese.anchor = GridBagConstraints.WEST;
		gbc_lblVietnamese.insets = new Insets(0, 0, 5, 5);
		gbc_lblVietnamese.gridx = 0;
		gbc_lblVietnamese.gridy = 4;
		add(lblVietnamese, gbc_lblVietnamese);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);

		vietNamTA = new JTextArea();
		vietNamTA.setText("This text is for test");
		scrollPane.setViewportView(vietNamTA);

		JLabel lblGoiNho = new JLabel("Gợi nhớ");
		GridBagConstraints gbc_lblGoiNho = new GridBagConstraints();
		gbc_lblGoiNho.anchor = GridBagConstraints.WEST;
		gbc_lblGoiNho.insets = new Insets(0, 0, 0, 5);
		gbc_lblGoiNho.gridx = 0;
		gbc_lblGoiNho.gridy = 5;
		add(lblGoiNho, gbc_lblGoiNho);

		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 5;
		add(scrollPane_1, gbc_scrollPane_1);

		goiNhoTA = new JTextArea();
		goiNhoTA.setText("This text to test tooo");
		scrollPane_1.setViewportView(goiNhoTA);

	}

	protected Vocabulary collectInfo() {
		String english = englishTF.getText();
		String hashtag = hashtagTF.getText();
		String phienAm = phienAmTF.getText();
		String tuloai = getTuLoai();
		String vn = vietNamTA.getText();
		String goiNho = goiNhoTA.getText();
		Vocabulary v = new Vocabulary(english, hashtag, tuloai, phienAm, vn, goiNho);
		return v;
	}

	protected String getTuLoai() {
		if (rdbtnNoun.isSelected()) {
			return "noun";
		} else if (rdbtnVerb.isSelected()) {
			return "verb";
		} else if (rdbtnAdj.isSelected()) {
			return "adj";
		} else if (rdbtnAdv.isSelected()) {
			return "adv";
		} else {
			return "other";
		}
	}

	protected void setData(Vocabulary v) {
		englishTF.setText(v.getEnglish());
		hashtagTF.setText(v.getHashtag());
		phienAmTF.setText(v.getPhienAm());
		vietNamTA.setText(v.getVietnamses());
		goiNhoTA.setText(v.getGoiNho());
	}

}
