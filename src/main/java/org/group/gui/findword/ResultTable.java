package org.group.gui.findword;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.group.model.Vocabulary;

public class ResultTable extends JPanel {
	private JTable table;
	private VocabTableModel tableModel;

	public ResultTable() {
		tableModel = new VocabTableModel();
		table = new JTable(tableModel);
		setLayout(new BorderLayout());
		add(new JScrollPane(table), BorderLayout.CENTER);
	}

	public void displayData(List<Vocabulary> vocabs) {
		tableModel.setVocabs(vocabs);
		tableModel.fireTableDataChanged();
	}
}
