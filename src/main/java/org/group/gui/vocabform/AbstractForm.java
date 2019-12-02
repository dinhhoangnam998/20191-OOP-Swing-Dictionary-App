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
	protected JTextField hastagTF;
	protected JTextField phienAmTF;
	protected JTextArea vietNamTA;
	protected JTextArea goiNhoTA;
	protected ButtonGroup tuLoaiGroup;

	public AbstractForm() {
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 104, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 94, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblEnglish = new JLabel("English");
		GridBagConstraints gbc_lblEnglish = new GridBagConstraints();
		gbc_lblEnglish.anchor = GridBagConstraints.WEST;
		gbc_lblEnglish.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnglish.gridx = 0;
		gbc_lblEnglish.gridy = 0;
		add(lblEnglish, gbc_lblEnglish);

		englishTF = new JTextField();
		englishTF.setText("abc");
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

		hastagTF = new JTextField();
		hastagTF.setText("#lala");
		GridBagConstraints gbc_hastagTF = new GridBagConstraints();
		gbc_hastagTF.insets = new Insets(0, 0, 5, 0);
		gbc_hastagTF.fill = GridBagConstraints.HORIZONTAL;
		gbc_hastagTF.gridx = 1;
		gbc_hastagTF.gridy = 1;
		add(hastagTF, gbc_hastagTF);
		hastagTF.setColumns(10);

		JLabel lblTuLoai = new JLabel("Tu loai");
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
		JRadioButton rdbtnNoun = new JRadioButton("noun");
		rdbtnNoun.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNoun.setActionCommand("noun");
		panel.add(rdbtnNoun);

		JRadioButton rdbtnVerb = new JRadioButton("verb");
		rdbtnNoun.setActionCommand("verb");
		panel.add(rdbtnVerb);

		JRadioButton rdbtnAdj = new JRadioButton("adj");
		rdbtnNoun.setActionCommand("adj");
		panel.add(rdbtnAdj);

		JRadioButton rdbtnAdv = new JRadioButton("adv");
		rdbtnNoun.setActionCommand("adv");
		panel.add(rdbtnAdv);

		JRadioButton rdbtnOther = new JRadioButton("other");
		rdbtnNoun.setActionCommand("other");
		rdbtnOther.setSelected(true);
		rdbtnOther.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(rdbtnOther);

		tuLoaiGroup.add(rdbtnNoun);
		tuLoaiGroup.add(rdbtnVerb);
		tuLoaiGroup.add(rdbtnAdj);
		tuLoaiGroup.add(rdbtnAdv);
		tuLoaiGroup.add(rdbtnOther);

		JLabel lblPhienAm = new JLabel("Phien am");
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

		JLabel lblVietnamese = new JLabel("Vietnamese");
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
		scrollPane.setViewportView(vietNamTA);

		JLabel lblGoiNho = new JLabel("Goi nho");
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
		scrollPane_1.setViewportView(goiNhoTA);

	}

	protected Vocabulary collectInfo() {
		String english = englishTF.getText();
		String hashtag = hastagTF.getText();
		String tuloai = tuLoaiGroup.getSelection().getActionCommand();
		System.out.println(tuloai);
		String phienAm = phienAmTF.getText();
		String vn = vietNamTA.getText();
		String goiNho = goiNhoTA.getText();
		Vocabulary v = new Vocabulary(english, hashtag, tuloai, phienAm, vn, goiNho);
		return v;
	}

}
