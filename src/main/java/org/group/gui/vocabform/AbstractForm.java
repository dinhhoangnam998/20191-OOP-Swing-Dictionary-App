package org.group.gui.vocabform;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AbstractForm extends JPanel {
	private JTextField txtAbc;
	private JTextField txtlala;
	private JTextField txthlo;

	public AbstractForm() {
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{104, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 94, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEnglish = new JLabel("English");
		GridBagConstraints gbc_lblEnglish = new GridBagConstraints();
		gbc_lblEnglish.anchor = GridBagConstraints.WEST;
		gbc_lblEnglish.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnglish.gridx = 0;
		gbc_lblEnglish.gridy = 0;
		add(lblEnglish, gbc_lblEnglish);
		
		txtAbc = new JTextField();
		txtAbc.setText("abc");
		GridBagConstraints gbc_txtAbc = new GridBagConstraints();
		gbc_txtAbc.insets = new Insets(0, 0, 5, 0);
		gbc_txtAbc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAbc.gridx = 1;
		gbc_txtAbc.gridy = 0;
		add(txtAbc, gbc_txtAbc);
		txtAbc.setColumns(10);
		
		JLabel lblHashtag = new JLabel("Hashtag");
		GridBagConstraints gbc_lblHashtag = new GridBagConstraints();
		gbc_lblHashtag.anchor = GridBagConstraints.WEST;
		gbc_lblHashtag.insets = new Insets(0, 0, 5, 5);
		gbc_lblHashtag.gridx = 0;
		gbc_lblHashtag.gridy = 1;
		add(lblHashtag, gbc_lblHashtag);
		
		txtlala = new JTextField();
		txtlala.setText("#lala");
		GridBagConstraints gbc_txtlala = new GridBagConstraints();
		gbc_txtlala.insets = new Insets(0, 0, 5, 0);
		gbc_txtlala.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtlala.gridx = 1;
		gbc_txtlala.gridy = 1;
		add(txtlala, gbc_txtlala);
		txtlala.setColumns(10);
		
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
		
		JRadioButton rdbtnNoun = new JRadioButton("noun");
		rdbtnNoun.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(rdbtnNoun);
		
		JRadioButton rdbtnVerb = new JRadioButton("verb");
		panel.add(rdbtnVerb);
		
		JRadioButton rdbtnAdj = new JRadioButton("adj");
		panel.add(rdbtnAdj);
		
		JRadioButton rdbtnAdv = new JRadioButton("adv");
		panel.add(rdbtnAdv);
		
		JRadioButton rdbtnOther = new JRadioButton("other");
		rdbtnOther.setSelected(true);
		rdbtnOther.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(rdbtnOther);
		
		JLabel lblPhienAm = new JLabel("Phien am");
		GridBagConstraints gbc_lblPhienAm = new GridBagConstraints();
		gbc_lblPhienAm.anchor = GridBagConstraints.WEST;
		gbc_lblPhienAm.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhienAm.gridx = 0;
		gbc_lblPhienAm.gridy = 3;
		add(lblPhienAm, gbc_lblPhienAm);
		
		txthlo = new JTextField();
		txthlo.setText("/h\u0259\u02C8lo\u028A/");
		GridBagConstraints gbc_txthlo = new GridBagConstraints();
		gbc_txthlo.insets = new Insets(0, 0, 5, 0);
		gbc_txthlo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txthlo.gridx = 1;
		gbc_txthlo.gridy = 3;
		add(txthlo, gbc_txthlo);
		txthlo.setColumns(10);
		
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
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
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
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);

	}

}
