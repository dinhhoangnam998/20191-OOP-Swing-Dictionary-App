package org.group.gui.findword;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.group.gui.event.listener.SearchByHashtagListener;
import org.group.gui.event.listener.SearchByWordListener;
import org.group.gui.event.object.SearchByHashtagEvent;
import org.group.gui.event.object.SearchByWordEvent;
import org.group.model.Vocabulary;

public class FindWord extends JPanel {
	private JTextField wordTF;
	private JTextField hashtagTF;
	private ResultTable table;
	protected JRadioButton rdbtnHashtag;
	private ButtonGroup btnGroup;
	protected JRadioButton rdbtnWord;
	private SearchByHashtagListener sbhHandler;
	private SearchByWordListener sbwHandler;

	public FindWord() {
		setLayout(null);

		rdbtnWord = new JRadioButton("Word");
		rdbtnWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wordTF.setEnabled(true);
				wordTF.requestFocus();
				hashtagTF.setEnabled(false);
			}
		});
		rdbtnWord.setBounds(8, 24, 84, 25);
		add(rdbtnWord);

		rdbtnHashtag = new JRadioButton("Hashtag");
		rdbtnHashtag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hashtagTF.setEnabled(true);
				hashtagTF.requestFocus();
				wordTF.setEnabled(false);
			}
		});
		rdbtnHashtag.setBounds(294, 24, 84, 25);
		add(rdbtnHashtag);

		btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnHashtag);
		btnGroup.add(rdbtnWord);

		wordTF = new JTextField();
		wordTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String keyword = wordTF.getText();
				sbwHandler.searchByWordOccur(new SearchByWordEvent(wordTF, keyword));
			}
		});
		wordTF.setBounds(90, 25, 142, 22);
		add(wordTF);
		wordTF.setColumns(10);

		hashtagTF = new JTextField();
		hashtagTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String keyword = hashtagTF.getText();
				sbhHandler.searchByHashtagOccur(new SearchByHashtagEvent(hashtagTF, keyword));
			}
		});
		hashtagTF.setBounds(386, 25, 142, 22);
		add(hashtagTF);
		hashtagTF.setColumns(10);

		table = new ResultTable();
		table.setBounds(8, 91, 520, 485);
		add(table);

	}

	public void setSbhHandler(SearchByHashtagListener sbhHandler) {
		this.sbhHandler = sbhHandler;
	}

	public void setSbwHandler(SearchByWordListener sbwHandler) {
		this.sbwHandler = sbwHandler;
	}

	public void displayData(List<Vocabulary> vocabs) {
		table.displayData(vocabs);
	}

}
