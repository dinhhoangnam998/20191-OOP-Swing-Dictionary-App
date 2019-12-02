package org.group.gui.findword;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.group.model.Vocabulary;

public class VocabTableModel extends AbstractTableModel {
	private List<Vocabulary> vocabs = new ArrayList<>();
	private String[] columns = { "word", "hashtag", "tu loai", "phien am", "nghia", "modify date" };

	public VocabTableModel() {
		super();
	}

	public VocabTableModel(List<Vocabulary> vocabs) {
		super();
		this.vocabs = vocabs;
	}

	public void setVocabs(List<Vocabulary> vocabs) {
		this.vocabs = vocabs;
	}

	@Override
	public String getColumnName(int column) {
		return columns[column];
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public int getRowCount() {
		return vocabs.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Vocabulary v = vocabs.get(rowIndex);
		if (columnIndex == 0) {
			return v.getEnglish();
		} else if (columnIndex == 1) {
			return v.getHashtag();
		} else if (columnIndex == 2) {
			return v.getTuLoai();
		} else if (columnIndex == 3) {
			return v.getPhienAm();
		} else if (columnIndex == 4) {
			return v.getVietnamses();
		} else if (columnIndex == 5) {
			return v.getModifyDate();
		} else {
			return "";
		}
	}

}
